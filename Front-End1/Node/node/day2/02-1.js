/*
    FileSystem 모듈
    파일 처리와 관련된 모듈입니다.
    node.js 에서 가장 중요하고 기초가 되는 모듈이다.

    메소드
    readFile() : 파일을 비동기적으로 읽음
    readFileSync() : 파일을 동기적으로 읽습니다.
    writeFile() : 파일을 비동기적으로 쓴다.
    writeFileSync() : 파일을 동기적으로 쓴다.

*/

const fs = require("fs"); // 파일을 다루는 모듈을 연결
const data = "hello node.js !";

fs.writeFile("text2.txt", data, "utf-8", (err) => {
  if (err) {
    console.log("err");
  } else {
    console.log("저장완료 / 비동기");
  }
});

fs.writeFileSync("text3.txt", data, "utf-8");
console.log("저장완료 / 동기");
