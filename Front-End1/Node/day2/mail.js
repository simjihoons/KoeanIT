// 보안 수준이 낮은 앱의 액세스
// https://myaccount.google.com/lesssecureapps

// 계정 액세스 사용을 허용
// https://accounts.google.com/DisplayUnlockCaptcha

//npm i nodemailer

const express = require("express");
const bodyParser = require("body-parser");
const fs = require("fs");
const nodemailer = require("nodemailer");
const app = express();
const port = 3000;
const router = express.Router();

app.use(bodyParser.urlencoded({ extended: false }));

// http://localhost:3000/mail
router.route("/mail").get((req, res) => {
  fs.readFile("main.html", "utf-8", (err, data) => {
    if (err) {
      console.log(err);
    } else {
      res.writeHead(200, { "content-type": "text/html" });

      res.end(data);
    }
  });

  router.route("mailok").post((req, res) => {
    const from = req.body.from; //보내는 이
    const fromemail = req.body.fromemail; //보내는 이메일
    const to = req.body.to; // 받는 사람
    const toemail = req.body.toemail; // 받는 사람의 이메일
    const title = req.body.title; // 제목
    const content = req.body.content; // 내용
    const fmtfrom = `${from}<${fromemail}>`; //보내는 사람의 메일주소
    const fmtto = `${to}<${toemail}>`; // 받는 사람의 메일 주소
    const transporter = nodemailer.createTransport({
      service: "Gmail", //이메일 서버
      auth: {
        use: "wlgnsgit@gmail.com", //보내는 메일 주소
        pass: "rhaxoddl12!@#A", //비밀번호
      },
      host: "smtp.mail.com", //메일서버
      port: "465", //포트
    });

    //실제로 메일전송 되었을때 객체
    const mailOptions = {
      from: fmtfrom,
      to: fmtto,
      subject: title,
      text: content,
    };

    transporter.sendMail(mailOptions, (err, info) => {
      transporter.close();
      if (err) {
        console.log(err);
      } else {
        console.log(info);
      }
    });
  });
});
app.use("/", router);
app.all("*", (req, res) => {
  res.status(404).send("<h2>페이지를 찾을 수 없습니다...</h2>");
});
app.listen(port, () => {
  console.log(`${port} 포트로 서버 실행중...`);
});
