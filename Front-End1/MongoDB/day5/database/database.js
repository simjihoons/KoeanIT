const mongoose = require("mongoose");
const { db_url } = require("../config/config");

let database = {};

database.init = (app, config) => {
  console.log("Call database init()!!");
  connect(app, config);
};

//DB 연결 함수
function connect(app, config) {
  console.log("Call connect()");
  mongoose.Promise = global.Promise; // 비동기 처리
  mongoose.connection(config.db_url); //config에 있는 db_url 연결
  database.db = mongoose.connection;

  //이벤트 적용
  database.db.on("error", console.log(console, "mongoose connection error"));
  database.db.on("open", () => {
    console.log("데이터베이스 연결 성공!");
    createSchema(app, config);
  });
}

function createSchema(app, config) {}

module.exports = database; // 내보내기
