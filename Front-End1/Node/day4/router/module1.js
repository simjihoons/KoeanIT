//npm i ejs

module.exports = (app, fs) => {
  app.get("/", (req, res) => {
    console.log("module1.js 실행");

    res.render("index.ejs", { length: 10 }); // ejs파일에 변수값을 전달.
  });

  app.get("/about", (req, res) => {
    res.render("about.html");
  });

  app.get("/list", (req, res) => {
    // __dirname => 현재폴더 , 현재디렉토리를 의미함  //__filename 현재 파일을 의미
    fs.readFile(__dirname + "/../data/member.json", "utf-8", (err, data) => {
      if (!err) {
        console.log(data);
        res.writeHead(200, { "content-type": "text/json;charset=utf-8" });
        res.end(data);
      } else {
        console.log(err);
      }
    });
  });

  //127.0.0.1:3000/getMember/apple
  app.get("/getMember/:userid", (req, res) => {
    fs.readFile(__dirname + "/../data/member.json", "utf-8", (err, data) => {
      if (!err) {
        const member = JSON.parse(data); //Json 형식으로 불러옴 이렇게 안하면 글자형으로 가지고오기때문
        res.json(member[req.params.userid]);
      } else {
        console.log(err);
      }
    });
  });

  //데이터 추가
  //127.0.0.1:3000/joinMember/:userid
  app.post("/joinMember/:userid", (req, res) => {
    const result = {};
    const userid = req.params.userid;

    //body에 입력이 안된 상태가 참이다.
    if (!req.body["password"] || !req.body["name"]) {
      result["success"] = 100; // 100 : 실패
      result["msg"] = "매개변수 전달 x";
      res.json(result);
      return false;
    }

    //아이디 중복 검사
    fs.readFile(__dirname + "/../data/member.json", "utf-8", (err, data) => {
      const member = JSON.parse(data);
      if (member[userid]) {
        result["success"] = 101; // 101 : 중복 아이디 존재
        result["msg"] = "duplicate";
        res.json(result);
        return false;
      }
      console.log(req.body);
      member[userid] = req.body; //아이디 패스워드
      fs.writeFile(
        __dirname + "/../data/member.json",
        JSON.stringify(member, null, "\t"),
        "utf-8",
        (err, data) => {
          if (!err) {
            result["success"] = 200;
            result["msg"] = "success";
            res.json(result);
          } else {
            console.log(err);
          }
        }
      );
    });
  });

  //수정
  //127.0.0.1/3000/updateMember/:userid
  app.put("/updateMember/:userid", (req, res) => {
    const result = {};
    const userid = req.params.userid;

    //body에 입력이 안된 상태가 참이다.
    if (!req.body["password"] || !req.body["name"]) {
      result["success"] = 100; // 100 : 실패
      result["msg"] = "매개변수 전달 x";
      res.json(result);
      return false;
    }
    fs.readFile(__dirname + "/../data/member.json", "utf-8", (err, data) => {
      if (!err) {
        const member = JSON.parse(data);
        fs.writeFile(
          __dirname + "/../data/member.json",
          JSON.stringify(member, null, "\t"),
          "utf-8",
          (err, data) => {
            if (!err) {
              //todo
              result["success"] = 200;
              result["msg"] = "success";
              res.json(result);
            } else {
              //todo
              console.log(err);
            }
          }
        );
      } else {
        console.log(err);
      }
    });
  });

  //삭제
  app.delete("/deleteMember/:userid", () => {
    let result = {};
    fs.readFile(__dirname + "/../data/member.json", "utf8", (err, data) => {
      const member = JSON.parse(data);
      if (!member[req.params.userid]) {
        result["success"] = 102;
        result["msg"] = "사용자를 찾을수 없음";
        res.json(result);
        return false;
      }
      delete member[req.params.userid];
      fs.writeFile(
        __dirname + "/../data/member.json",
        JSON.stringify(member, null, "\t"),
        "utf8",
        (err, data) => {
          result["success"] = 200;
          result["msg"] = "성공";
          res.json(result);
        }
      );
    });
  });
};
