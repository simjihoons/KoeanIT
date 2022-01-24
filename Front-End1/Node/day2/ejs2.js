const express = require("express");
const fs = require("fs");
// npm i ejs
const ejs = require("ejs"); //npm i ejs

const app = express();
const port = 3000;

const router = express.Router();

// localhost:3000/login
router.route("/login").post((req, res) => {
  const useinfo = { userid: "apple", userpw: "1234" };
  fs.readFile("./ejs2.ejs", "utf8", (err, data) => {
    if (!err) {
      res.writeHead(200, { "content-type": "text/html" });
      res.end(ejs.render(data, useinfo));
    } else {
      console.log(err);
    }
  });
});

app.use("/", router);

app.all("*", (req, res) => {
  res.status(404).send("<h2>페이지를 찾을 수 없습니다.</h2>");
});

app.listen(port, () => {
  console.log(`${port} 포트로 서버 실행중...`);
});
