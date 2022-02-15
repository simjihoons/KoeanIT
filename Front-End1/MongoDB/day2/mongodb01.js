const express = require("express");
const bodyParser = require("body-parser");

//npm i mongodb
const MongoClient = require("mongodb").MongoClient; //mongoDB 클라이언트 모듈

const app = express();
const router = express.Router();
const port = 3000;

app.use(bodyParser.urlencoded({ extended: false }));

let database; // 몽고디비 연결 객체

//mongoDB 연결 함수
function connectDB() {
  const databaseURL = "mongodb://localhost:27017"; // 몽고디비 프로토콜
  MongoClient.connect(databaseURL, { useUnifiedTopology: true }, (err, db) => {
    if (!err) {
      const tempdb = db.db("frontenddb01"); // 접근하고자 하는 DB의 이름
      database = tempdb;
      console.log("👌 MongoDB Connection successful.");
    } else {
      console.log(err);
    }
  }); //이것을 쓰기위해 모듈을 가져와야함
}

//회원가입
//http://localhost:3000/member/regist (post)
router.route("/member/regist").post((req, res) => {
  console.log("Call /member/regist ");
  const userid = req.body.userid;
  const userpw = req.body.userpw;
  const username = req.body.username;
  const age = req.body.age;

  //입력값 확인
  console.log(
    `userid : ${userid} , userpw : ${userpw} , username : ${username} , age : ${age}`
  );

  if (database) {
    //생성이 된 경우
    joinMember(database, userid, userpw, username, age, (err, result) => {
      if (!err) {
        //insert 여부 확인 , 저장이 되었는데 1개 이상인지 아닌지 확인
        if (result.insertedCount > 0) {
          res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
          res.write("<h2>회원가입 성공</h2>");
          res.write("<p>가입이 성공적으로 완료되었습니다.</p>");
          res.end();
        } else {
          res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
          res.write("<h2>회원가입 실패</h2>");
          res.write("<p>오류가 발생</p>");
          res.end();
        }
      } else {
        res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
        res.write("<h2>회원가입 실패</h2>");
        res.write("<p>오류가 발생</p>");
        res.end();
      }
    }); //함수호출
  } else {
    //생성이 안된 경우
    res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
    res.write("<h2>데이터베이스 연결 실패</h2>");
    res.write("<p>오류가 발생</p>");
    res.end();
  }
});

//로그인
//http://localhost:3000/member/login (post)
router.route("/member/login").post((req, res) => {
  console.log("Call /member/login ");
  const userid = req.body.userid;
  const userpw = req.body.userpw;

  console.log(`userid : ${userid} , userpw : ${userpw}`);

  //데이터베이스 연결 상태 확인
  if (database) {
    loginMember(database, userid, userpw, (err, result) => {
      //콜백 함수연결 상태 확인
      if (!err) {
        if (result) {
          //result 값에 대한 확인
          console.log(result); // db에서 정보 갖고옴
          const resultUserid = result[0].userid;
          const resultUserpw = result[0].userpw;
          const resultUsername = result[0].username;
          const resultAge = result[0].age;

          //로그인 된것을 알려주기 위함
          res.writeHead(200, { "content-type": "text/html;charset=utf8" });
          res.write("<h2>로그인 성공</h2>");
          res.write(`<p>${resultUserid}(${resultUsername})님 환영합니다.</p>`);
          res.write(`<p>나이 : ${resultAge}살</p>`);
          res.end();
        } else {
          res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
          res.write("<h2>로그인 실패</h2>");
          res.write("<p>아이디 또는 비밀번호를 확인하세요</p>");
          res.end();
        }
      } else {
        res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
        res.write("<h2>로그인 실패</h2>");
        res.write("<p>오류가 발생</p>");
        res.end();
      }
    });
  } else {
    res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
    res.write("<h2>데이터베이스 연결 실패</h2>");
    res.write("<p>오류가 발생</p>");
    res.end();
  }
});

//정보 수정
//http://localhost:3000/member/edit (post)
router.route("/member/edit").post((req, res) => {
  console.log("Call /member/edit!");

  const userid = req.body.userid;
  const userpw = req.body.userpw;
  const username = req.body.username;
  const age = req.body.age;

  //입력값 확인
  console.log(
    `userid : ${userid} , userpw : ${userpw} , username : ${username} , age : ${age}`
  );

  if (database) {
    editMember(database, userid, userpw, username, age, (err, result) => {
      if (!err) {
        if (result.modifiedCount > 0) {
          res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
          res.write("<h2>회원정보 수정 성공</h2>");
          res.write("<p>성공</p>");
          res.end();
        } else {
          res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
          res.write("<h2>회원정보 수정 실패</h2>");
          res.write("<p>오류가 발생</p>");
          res.end();
        }
      } else {
        res.writeHead(200, { "content-type": "text/html;charset=utf-8" });
        res.write("<h2>회원정보 수정 실패</h2>");
        res.write("<p>오류가 발생</p>");
        res.end();
      }
    });
  } else {
    res.writeHead(200, { "content-type": "text/html;charset=utf8" });
    res.write("<h2>데이터베이스 연결 실패</h2>");
    res.write("<p>mongodb 데이터베이스에 연결하지 못했습니다</p>");
  }
});

//callback func-----------------------------------------------------------------------------------

//회원가입 JoinMember
const joinMember = (database, userid, userpw, username, age, callback) => {
  console.log("Call joinMember!");
  const members = database.collection("member"); // DB의 member 컬렉션을 객체로 가져오는것

  //members.insertMany(); => 컬렉션을 저장
  //여러 컬렉션을 저장할 수도 있기때문에 배열 방식으로 진행
  members.insertMany(
    [
      {
        userid: userid,
        userpw: userpw,
        username: username,
        age: age,
      },
    ],
    (err, result) => {
      if (!err) {
        //insertedCount => 추가되는 객체의 갯수
        if (result.insertedCount > 0) {
          console.log(`사용자 document ${result.insertedCount}명 추가 되었음`);
        } else {
          console.log(`사용자 document 추가되지 않음`);
        }

        callback(null, result); //(에러 , 결과)
        return; //에러가 발생하지 않았을때 더이상 진행하지 않게 하기위해 리턴
      } else {
        console.log(err);
        callback(err, null); // (에러,결과)
      }
    }
  );
};

//로그인
const loginMember = (database, userid, userpw, callback) => {
  console.log("Call loginMember!");
  const members = database.collection("member"); // DB의 member 컬렉션을 객체로 가져오는것

  //find는 여러 객체를 찾을 수 있기 때문에 배열로 사용하기 위해 toArray를 사용
  members.find({ userid: userid, userpw: userpw }).toArray((err, result) => {
    //find() 실행 여부
    if (!err) {
      //find()하고 몇개를 찾았는지
      if (result.length > 0) {
        console.log("사용자를 찾음");
        callback(null, result);
      } else {
        console.log("사용자가 없거나 비밀번호 틀림");
        callback(null, null);
      }
    } else {
      console.log(err);
      callback(err, null);
    }
  });
};

//정보 수정
const editMember = (database, userid, userpw, username, age, callback) => {
  console.log("Call editMember!");
  const members = database.collection("member"); // DB의 member 컬렉션을 객체로 가져오는것
  members.updateOne(
    { userid: userid },
    { $set: { userid: userid, userpw: userpw, username: username, age: age } },
    (err, result) => {
      if (!err) {
        // modifiedCount 프로퍼티 수정한 갯수
        if (result.modifiedCount > 0) {
          console.log(`사용자 document ${result.modifiedCount}명 수정됨`);
        } else {
          console.log("수정된 document 없음");
        }
        callback(null, result);
        return;
      } else {
        console.log(err);
        callback(err, null);
      }
    }
  );
};

//------------------------------------------------------------------------------------callback func

app.use("/", router);

app.listen(port, () => {
  console.log(`${port}포트로 서버 동작중...`);
  connectDB(); // 몽고디비 연결 함수
});
