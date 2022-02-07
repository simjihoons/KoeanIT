const express = require("express");
const fs = require("fs");
const bodyParser = require("body-parser");

const app = express();
const port = 3000;

app.engine("html", require("ejs").renderFile); //view 엔진 등록 => (views 폴더생성해야함!!!) // ejs파일을 자동으로 html로 변환
app.use(bodyParser.urlencoded({ extended: false })); //post 방식

//const 객체명 = require("파일명");
const module1 = require("./router/module1")(app); //express()를 전달

app.listen(port, () => {
  console.log(`${port}번 포트로 서버 실행중...`);
});
