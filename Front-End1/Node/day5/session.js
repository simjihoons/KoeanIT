const express = require("express");
const bodyparser = require("body-parser");

//npm i express-session
const expiresSession = require("express-session");
const fs = require("fs");

const app = express();
const port = 3000;

app.use(bodyparser.urlencoded({ extened: false }));

// express모듈에 expiresSession를 종속시켜 기능을 추가
//!@#$%^ => 암호화로 사용할 특수문자를 함께 입력
app.use(
  expiresSession({
    secret: "!@#$%^&*()",
    resave: false,
    saveUninitialized: true,
  })
);

//route
//로그인 시작 페이지
app.get("/login", (req, res) => {
  fs.readFile("login.html", "utf-8", (err, data) => {
    if (!err) {
      res.writeHead(200, { "content-type": "text/html" });
      res.end(data);
    } else {
      console.log(err);
    }
  });
});

app.post("/loginOk", (req, res) => {
  const userid = req.body.userid;
  const userpw = req.body.userpw;

  console.log(userid);
  console.log(userpw);

  if (userid === "admin" && userpw === "1234") {
    req.session.member = {
      id: userid,
      userpw: userpw,
      isauth: true,
    };
    res.redirect("/welcome");
  } else {
    //로그인 실패 시
    res.redirect("/fail");
  }
});

//정상적인 로그인이 되었을때
app.get("/welcome", (req, res) => {
  if (req.session.member) {
    console.log(req.session.member);
    fs.readFile("welcome.html", "utf-8", (err, data) => {
      res.writeHead(200, { "content-type": "text/html" });
      res.end(data);
    });
  } else {
    res.redirect("/login");
  }
});

//로그인 실패시
app.get("/fail", (req, res) => {
  fs.readFile("fail.html", "utf-8", (err, data) => {
    if (!err) {
      res.writeHead(200, { "content-type": "text/html" });
      res.end(data);
    } else {
      console.log(err);
    }
  });
});

//직접로그아웃을 했을때
app.get("/logout", (req, res) => {
  req.session.destory(() => {
    console.log("session delete");
  });
  res.redirect("/login");
});

app.listen(port, () => {
  console.log(`${port}포트로 서버 실행중...`);
});
