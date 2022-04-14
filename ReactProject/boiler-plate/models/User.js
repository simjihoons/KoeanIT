const mongoose = require("mongoose");

const userSchema = mongoose.Schema({
  name: {
    type: String,
    maxlength: 50,
  },
  email: {
    type: String,
    //trim true는 xxx xxx@naver.com 라 했을때 xxxxxx으로 공백을 없애줌
    trim: true,
    unique: 1, // 똑같은 이메일을 사용하지 못하게
  },
  password: {
    type: String,
    minlength: 8,
  },
  lastname: {
    type: String,
    maxlength: 50,
  },
  role: {
    //관리자인지 일반 유저인지
    type: Number, // 넘버가 1이면 관리자 0이면 일반유저
    default: 0, // 기본값으로 0
  },
  image: String,
  token: {
    //유효성 검사
    type: String,
  },
  tokenExp: {
    //토튼 사용할수 있는 기간
    type: Number,
  },
});

const User = mongoose.model("User", userSchema); // 스키마를 모델로 감싸줌

module.exports = { User }; // 다른 곳에서 사용할 수 있게 exports 시켜줌
