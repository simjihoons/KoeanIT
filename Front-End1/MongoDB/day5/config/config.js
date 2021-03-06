module.exports = {
  server_port: 3000, //port 설정
  db_url: "mongodb://localhost:27017/frontendb01", // DB 연결

  //스키마 생성
  db_schemas: [
    {
      file: "./member_schema",
      collection: "member2",
      schemaName: "MemberSchema",
      modelName: "MemberModel",
    },
  ],

  //페이스북에서 가져올 세션
  facebook: {
    clientID: "532728584733522",
    clientSecret: "67758765c0390e3d431d5abe2cf51afa",
    callbackURL: "http://localhost:3000/auth/facebook/callback",
  },
};
