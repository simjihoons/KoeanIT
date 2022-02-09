const express = require("express");

//npm i cookie-parser
const cookieParser = require("cookie-parser");
const app = express();
const port = 3000;

app.use(bodyparser.urlencoded({ extened: false }));

// express모듈에 cookie-parser를 종속ㅇ시켜 기능을 추가
//!@#$%^ => 암호화로 사용할 특수문자를 함께 입력
app.use(cookieParser("!@#$%^&*()"));

//route
app.get("/setCookie", (req, res) => {
  console.log("setCookie 호출");

  //cookie 세팅
  res.cookie(
    "member",
    {
      id: "apple",
      name: "김사과",
      gender: "여자",
    },
    { maxAge: 1000 * 60 * 3 } //만료시간설정
  );
  res.redirect("/showCookie");
});

app.get("/showCookie", (req, res) => {
  console.log("showCookie 호출");

  res.send(req.cookies);
  res.end();
});

app.listen(port, () => {
  console.log(`${port}포트로 서버 실행중...`);
});
