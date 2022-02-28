const local_signup = require("./passport/local_signup");
const local_login = require("./passport/local_login");
const facebook = require("./passport/facebook");

module.exports = (app, passport) => {
  console.log("Call config/passport!!");

  passport.serializeUser((user, done) => {
    //아이디 패스워드등 도큐먼트
    console.log("serializeUser() 호출!", user);
    // done(null, user.id); // id만 세션에 저장
    done(null, user); // user 객체 세션에 저장
  });

  passport.deserializeUser((user, done) => {
    console.log("deserializeUser() 호출!", user);
    done(null, user);
  });

  passport.use("local_signup", local_signup);
  passport.use("local_login", local_login);
  passport.use("facebook", facebook);
};
