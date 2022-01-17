const http = require("http"); // 모듈 가져오기
const hostname = "127.0.0.1"; // 서버 주소
const port = 3000; // 인터넷 경로

const server = http.createServer((req, res) => {
  res.statusCode = 200; //응답상태 정상코드 (200)
  res.setHeader("Content-Type", "text/plain"); //응답을 받을때 파일의 방식
  res.end("Hello World"); // 응답을 하고 실제로 받는 결과물
});

server.listen(port, hostname, () => {
  //서버에서 파일을 실행했을때 클라이언트에게 상태를 전달하는 부분
  console.log(`Server running at http://${hostname}:${port}/`);
});
