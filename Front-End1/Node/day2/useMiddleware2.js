const express = require("express");
const bodyParser = require("body-parser"); // post 데이터를 전달받기 위해 사용

const app = express();
const port = 3000;

//미들웨어 사용법2--------------------------------
app.get("/", function (req, res, next) {
  res.send("hello, World2");
  next(); //다음 미들웨어로 이동하는 메소드
});

const myLogger = function (req, res, next) {
  console.log("LOGGED");
  next();
};

app.use(myLogger);

app.listen(port, () => {
  console.log(`${port}포트로 연결중...`);
});
