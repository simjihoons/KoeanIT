const express = require("express");
const app = express();
const port = 5000;
const bodyParser = require("body-parser");
const { User } = require("./models/User");

//⬇application/x-www-form-urlencoded 이런 파일을 분석 ⬇
app.use(bodyParser.urlencoded({ extended: true }));

//⬇ application/json 이런 파일을 분석 ⬇
app.use(bodyParser.json({ extended: true }));

//key.js 가져오기
const config = require("./config/key");

const mongoose = require("mongoose");
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
app.post("/register", (req, res) => {
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

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
