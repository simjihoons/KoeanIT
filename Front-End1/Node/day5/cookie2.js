const express = require("express");

//npm i cookie-parser
const cookieParser = require("cookie-parser");
const bodyparser = require("body-parser");
const fs = require("fs");
const { runInNewContext } = require("vm");

const app = express();
const port = 3000;

app.use(bodyparser.urlencoded({ extened: false }));

// express모듈에 cookie-parser를 종속ㅇ시켜 기능을 추가
//!@#$%^ => 암호화로 사용할 특수문자를 함께 입력
app.use(cookieParser("!@#$%^&*()"));

//route
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
    const expiresDay = new Date(Date.now + 1000 * 60 * 60 * 24); // 1000* 60 => 1분  1000* 60*60 => 1시간
    res.cookie("userid", userid, { expires: expiresDay, signed: true });
    res.redirect("/welcome");
  } else {
    //로그인 실패 시
    res.redirect("/fail");
  }
});

//로그인 성공했을때 route
app.get("/welcome", (req, res) => {
  const cookieUserid = req.signedCookies.userid;
  console.log(cookieUserid);

  if (cookieUserid) {
    fs.readFile("welcome.html", "utf-8", (err, data) => {
      if (!err) {
        res.writeHead(200, { "content-type": "text/html" });
        res.end(data);
      } else {
        res.redirect("/login");
      }
    });
  }
});

//로그인 실패했을때 route
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

//로그아웃했을때
app.get("/logout", (req, res) => {
  fs.readFile("login.html", "utf-8", (err, data) => {
    if (!err) {
      res.writeHead(200, { "content-type": "text/html" });
      res.end(data);
    }
  });
});

app.listen(port, () => {
  console.log(`${port}포트로 서버 실행중...`);
});
