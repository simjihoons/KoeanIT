/*
  http 모듈
  node.js 에서 가장 기본적이고 중요한 서버 모듈
  HTTP웹 서버를 생성하는 것과 관련된 모든 기능을 담당

  메소드
  listen() : 서버를 실행하고 클라이언트를 기다림
  close() : 서버를 종료

  request 객체 : 클라이언트가 서버에게 전달하는 메세지(정보)를 담는 객체
  속성
    method : 클라이언트 요청 방식을 나타냄 (GET,POST)
    url : 클라이언트가 요청한 URL을 나타냄

  response 객체 : 서버에서 클라이언트로 응답메세지를 전송시켜주는 객체
  메소드
    writeHead() : 응답 헤더 작성
    end() : 응답 본문을 작성

  MIME 형식
    text/plain : 일반적인 text 파일
    text/html : html 형식 파일
    text/css : css 형식 파일
    text/xml : xml 형식 파일
    image/jpeg : jpeg 이미지 파일
    image/png : png 이미지 파일
    video/mpeg : mpeg 동영상 파일
    audio/mp3 : mp3 음악 파일
*/

const http = require("http");

http
  .createServer((req, res) => {
    res.writeHead(200, { "content-type": "text/html" });
    res.end(
      '<!DOCTYPE html><html lang="ko"><head><meta charset="UTF-8"><title>http 모듈 테스트</title></head><body style="background-color:deepskyblue;"><h2>http 모듈 테스트</h2><p>처음으로 실행하는 node.js http 서버</p></body></html>'
    );
  })
  .listen(3000, () => {
    console.log("start server...");
  });
