import { User } from "../models/User";

let auth = (req, res, next) => {
  //인증 처리를 하는곳
  //1. 클라이언트 쿠키에서 토큰을 가져온다.
  let token = req.cookies.x_auth;

  //2. 토큰을 복호화 해서 유저를 찾는다.
  // 유저 모델에서 메서드 만들기
  User.findByToken(token, (err, user) => {
    if (err) throw err;
    if (!user) return res.json({ isAuth: false, error: true });

    //유저가 있을때
    //req에 token과 user를 넣어줌으로 인해 index.js에서 req.token 과 req.user를 그대로 사용할 수 있다.
    req.token = token;
    req.user = user;
    next();
  });

  //3. 유저가 있으면 인증 Okay

  //4. 없다면 인증 No
};

module.exports = { auth };
