const { Schema } = require("mongoose");
// npm i crypto
const crypto = require("crypto"); //암호화 시키는 모듈
const passport = require("passport");

Schema.createSchema = function (mongoose) {
  console.log("createSchema() 호출!");
  const MemberSchema = mongoose.Schema({
    //객체형태로 스키마 생성
    userid: { type: String, require: true, default: "" },
    //타입은 문자, 데이터는 무조건 들어가야하고 만약 없다면 공백
    hashed_password: { type: String, default: "" }, //sns에서는 없을수도  있다
    name: { type: String, default: "" },
    salt: { type: String }, //비밀번호를 암호화 시킬때 사용
    age: { type: Number, default: 0 },
    created_at: { type: Date, default: Date.now }, //가입날짜
    updated_at: { type: Date, default: Date.now }, //수정된 날짜
    provider: { type: String, default: "" }, //간단로그인 하는 경로
    authToken: { type: String, default: "" }, //간단로그인한곳에 가입하기 했을때 인증할 코드
    facebook: {},
  });

  //가상 필드
  MemberSchema.virtual("userpw")
    .set((userpw) => {
      this._userpw = userpw;
      this.salt = this.makeSalt();
      this.hashed_password = this.encrytPassword(userpw);
    })
    .get(() => {
      return this._userpw;
    });

  MemberSchema.method("makeSalt", () => {
    console.log("makeSalt() 호출");
    return Math.round(new Date().valueOf() * Math.random()) + ""; // + " " 숫자값을 문자열로 변환 // 오늘 날짜에 무작위의 숫자값을 곱하기 -> 숫자형 문자형 변환
  });

  // 로그인한 비밀번호가 있다면 회원이기 떄문에 로그인을 실행 , 아니라면 회원가입 실행
  MemberSchema.method("encryptPassword", (plainText, inSalt) => {
    if (insalt) {
      //로그인
      return crypto.createHmac("sha1", inSalt).update(plainText).digest("hex"); // sha1 : 단방향 암호화 // 전달 받은 inSalt값을 plainText와 합쳐서 16진수로 저장
    } else {
      //회원가입
      return crypto
        .createHmac("sha1", this.salt)
        .update(plainText)
        .digest("hex");
    }
  });

  MemberSchema.method(
    "authenticate",
    function (plainText, inSalt, hashed_password) {
      if (inSalt) {
        console.log("authenticate() 호출! <inSalt 있음>");
        return this.encryptPassword(plainText, inSalt) == hashed_password;
      } else {
        console.log("authenticate() 호출! <inSalt 없음>");
        return this.encryptPassword(plainText) == this.hashed_password;
      }
    }
  );

  MemberSchema.pre("save", (next) => {
    if (!this.isNew) return next();
    if (!validatePresenceOf(this.userpw)) {
      next(new Error("유효하지 않은 password입니다."));
    } else {
      next();
    }
  });
  const validatePresenceOf = function (value) {
    return value && value.length; // 데이터가 있는지 여부
  };
  console.log("MemberSchema 정의 완료!");
  return MemberSchema;
};

module.exports = Schema;
