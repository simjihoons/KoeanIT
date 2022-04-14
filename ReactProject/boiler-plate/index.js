const express = require("express");
const app = express();
const port = 5000;
const bodyParser = require("body-parser");
const cookieParser = require("cookie-parser");
const { User } = require("./models/User");

//⬇application/x-www-form-urlencoded 이런 파일을 분석 ⬇
app.use(bodyParser.urlencoded({ extended: true }));

//⬇ application/json 이런 파일을 분석 ⬇
app.use(bodyParser.json({ extended: true }));
app.use(cookieParser());

//key.js 가져오기
const config = require("./config/key");

const mongoose = require("mongoose");

//auth.js
const { auth } = require("./middleware/auth");

mongoose
  .connect(config.mongoURI)
  //연결 확인
  .then(() => console.log("MongoDB Connected..."))
  //연결시 오류날때
  .catch((err) => console.log(err));

app.get("/", (req, res) => {
  res.send("Hello World!!!!");
});

// 회원가입 라우터 start==============================================================
app.post("/api/users/register", (req, res) => {
  //회원가입할때 필요한 정보들을 client에서 가져오면
  //그 정보를 DB에 보내준다.
  // 이를 위해 User 모델을 가져와야한다.
  const user = new User(req.body);

  // save() => 몽고디비 메서드로써 정보들이 유저 모델에 저장됨.
  user.save((err, userInfo) => {
    if (err) return res.json({ success: false, err });

    //status(200)=> 성공을 의미한다.
    return res.status(200).json({ success: true });
  });
});
// 회원가입 라우터 end==============================================================

// 로그인 라우터 start==========================
app.post("/api/users/login", (req, res) => {
  //1. 요청된 이메일을 데이터베이스에서 있는지 확인
  //findOne() => 몽고DB 메서드
  User.findOne({ email: req.body.email }, (err, user) => {
    if (!user) {
      //유저가 없을때
      return res.json({
        loginSuccess: false,
        message: "제공된 이메일에 해당하는 유저가 없습니다.",
      });
    }
    //요청된 이메일이 DB에 있으면 PW가 맞는지 확인
    //User.js에 따로 메소드 만들기
    user.comparePassword(req.body.password, (err, isMatch) => {
      if (!isMatch)
        return res.json({
          loginSuccess: false,
          message: "비밀번호가 틀렸습니다.!",
        });

      //비밀번호가 맞으면 토큰을 생성하기
      //User.js에(유저모델) 따로 메소드 만들기
      user.generateToken((err, user) => {
        if (err) return res.status(400).send(err);

        //토큰을 저장한다. 어디에 ? 쿠키, 로컬스토리지 , 등등 저장가능.
        // 여기선 쿠키에 저장한다.
        // yarn add cookie-parser
        //x_auth는 임의로 정한이름
        res
          .cookie("x_auth", user.token)
          .status(200)
          .json({ loginSuccess: true, userId: user._id });
      });
    });
  });
});
// 로그인 라우터 end============================

// Auth 기능
//auth라는 middleware 추가한다.
//middleware는 엔드포인트에서 req를 받고 콜백함수를 받기전에 어떤것을 하는것.
app.get("/api/users/auth", auth, (req, res) => {
  //여기까지 미들웨어를 통과해 왔다는 말은 Authentication이 true라는 말이다.
  //true인것을 프론트에 전달
  req.status(200).json({
    _id: req.user._id, // auth에서 user에 넣었기때문에 가능
    isAdmin: req.user.role === 0 ? false : true, // role이 0이면 일반유저
    isAuth: true,
    email: req.user.email,
    name: req.user.name,
    lastname: req.user.lastname,
    role: req.user.role,
    image: req.user.image,
  });
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
