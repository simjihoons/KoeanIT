//nodemon 사용

const express = require("express");
const bodyParser = require("body-parser"); // post 데이터를 전달받기 위해 사용

const app = express();
const port = 3000;

//라우터 모듈 가져오기
const router = express.Router();

//body-parser를 이용해 application/x-www-form-urlencoded 피싱
app.use(bodyParser.urlencoded({ extended: false }));

router.route("/member/login").post((req, res) => {
  //127.0.0.1/member/login
  console.log("/member/login 호출");
  res.writeHead(200, { "content-type": "text/html;charset=utf8" });
  res.write("<h2>서버에서 응답 /member/login 호출</h2>");
  res.end();
});

router.route("/member/regist").post((req, res) => {
  //127.0.0.1/member/login
  console.log("/member/regist 호출");
  res.writeHead(200, { "content-type": "text/html;charset=utf8" });
  res.write("<h2>서버에서 응답 /member/regist 호출</h2>");
  res.end();
});
router.route("/member/about").get((req, res) => {
  //127.0.0.1/member/login
  console.log("/member/about 호출");
  res.writeHead(200, { "content-type": "text/html;charset=utf8" });
  res.write("<h2>서버에서 응답 /member/about 호출</h2>");
  res.end();
});

app.use("/", router);

//에러가 발생했을때
app.all("*", (req, res) => {
  res.status(404).send(`<h2>페이지 못찾음</h2>`);
});

app.listen(port, () => {
  console.log(`${port}포트로 연결중...`);
});
