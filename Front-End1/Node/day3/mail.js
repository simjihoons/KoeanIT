// npm i nodemailer
const nodemailer = require("nodemailer");

const transporter = nodemailer.createTransport({
  service: "Gmail",
  auth: {
    user: "wlgnsgit@gmail.com", //보내는 사람
    pass: "rhaxoddl12!@#A", // 보내는 사람
  },
  host: "smtp.mail.com",
  port: "465",
});

const mailOptions = {
  from: "심지훈<wlgnsgit@gmail.com>", // 보내는사람
  to: "심지훈<tlawlgns6305@naver.com>", //받는 사람
  subject: "node.js의 nodemailer 테스트중입니다.",
  html: "<h2>안녕하세요. 메일이 잘 가나요?</h2><p style='color: deeppink'>정말 잘 가네요~~</p>",
};

transporter.sendMail(mailOptions, (err, info) => {
  transporter.close();
  if (err) {
    console.log(err);
  } else {
    console.log(info);
  }
});
