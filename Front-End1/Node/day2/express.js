const express = require("express");
const app = express();
const port = 3000;

//요청
app.use((req, res) => {
  console.log("첫번째 미들웨어 실행");

  console.dir(req.header);
  const userAgent = req.header("User-Agent");
  console.log(userAgent);

  const paraName = req.query.userid; // get  방식의 변수값을 가져옴
  console.log(paraName);

  res.writeHead(200, { "content-type": "text/html;charset=utf8" });
  res.write("<h2>익스프레스 서버에서 응답한 메세지</h2>");
  res.write(`<p>User-Agent :${userAgent}`);
  res.write(`<p>paraName :${paraName}`);
});

//서버상태 표시응답
app.listen(port, () => {
  console.log(`${port}포트로 서버 실행중`);
});
