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
  mongoose.connect(config.db_url); //config에 있는 db_url 연결
  database.db = mongoose.connection;

  //이벤트 적용
  // 객체.on("이벤트",실행할 함수) error,open,close etc...

  database.db.on(
    "error",
    console.error.bind(console, "mongoose connection error")
  );
  database.db.on("open", () => {
    console.log("데이터베이스 연결 성공!");
    createSchema(app, config); // 스키마함수호출
  });
}

function createSchema(app, config) {
  const schemaLen = config.db_schemas.length;
  console.log(`스키마 수 : ${schemaLen}`);

  for (let i = 0; i < schemaLen; i++) {
    /*
    {
          file: './member_schema',
          collection: 'member2',
          schemaName: 'MemberSchema',
          modelName: 'MemberModel'
      }
  */
    let curItem = config.db_schemas[i];
    let curSchema = require(curItem.file).createSchema(mongoose); //스키마 생성
    console.log(`${curItem.file} 모듈을 불러온 후 스키마를 정의함`);

    let curModel = mongoose.model(curItem.collection, curSchema); //모델 생성
    console.log(`${curItem.collection} 컬렉션을 위해 모델을 정의함`);

    database[curItem.schemaName] = curSchema; // database[MemberSchema]
    database[curItem.modelName] = curModel; // database[MemberModel]
    console.log(
      `스키마이름[${curItem.schemaName}], 모델이름[${curItem.modelName}]이 데이터베이스 객체의 속성으로 추가되었습니다.`
    );
    app.set("database", database);
    console.log("database 객체가 app객체의 속성으로 추가됨");
  }
}

module.exports = database; // 내보내기
