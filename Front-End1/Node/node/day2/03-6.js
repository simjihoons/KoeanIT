/*
    익스프레스 모듈
   http 모듈만 사용해서 웹 서버를 구성하면 직접 많은 기능을 개발해야한다
   이 문제를 해결하기 위해 만들어진 모듈이 익스프레스이다.
   익스프레스 모듈을 사용하면 간단한 코드로 웹 서버의 기능을 대부분 구현할 수 있고, 미들웨어와
   라우터를 사용하여 편리하게 웹 서버를 구성가능
   따로 설치를 해야 한다.

    [package 설치]
    npm install 모듈명(npm i 모듈명)
    npm i express

    [package 복원]
    npm install


    메소드
    use() :
    get() :
    set() :
    redirect() :
    send() :
    header() :
*/

const express = require("express");
const app = express();
const port = 3000;

//express의 기본 형식
app.get("/", (req, res) => {
  console.log("첫번째 미드웨어 실행");
  res.redirect("http://www.naver.com");
});

app.listen(port, () => {
  console.log(`${port}포트로 서버 실행중...`);
});
