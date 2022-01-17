/*
    event
    이벤트 위주의 프로그램을 작성할 떄 사용하는 모듈

    메소드
    on() : 지정한 이벤트의 리스너를 추가
    once() : 지정한 이벤트의 리스너를 추가하지만 한번 실행 이후 자동 제거
    removelistener() : 지정한 이벤트에 대한 리스너를 제거합니다.
    emit() : 지정한 이벤트를 발생시킴
*/

const event = require("events");

//이벤트 관련 메소드를 사용할 수 있는 EventEmitter 개체를 만듬
const eventEmitter = new event.EventEmitter();

const connectHandle = function () {
  //3
  console.log("연결성공!");
  eventEmitter.emit("data_received"); // 다시 이벤트가 발생 4
};

// connection 이벤트와 connectHandler 와 연결 2
eventEmitter.on("connection", connectHandle);

// data_receive 이벤트와 익명함수와 연결
eventEmitter.on("data_received", () => {
  console.log("데이터수신");
});

eventEmitter.emit("connection"); //이벤트를 발생 1
