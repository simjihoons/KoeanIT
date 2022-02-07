//npm i ejs

module.exports = (app, fs) => {
  app.get("/", (req, res) => {
    console.log("module1.js 실행");

    res.render("index.ejs", { length: 10 }); // ejs파일에 변수값을 전달.
  });

  app.get("/about", (req, res) => {
    res.render("about.html");
  });

  app.get("/list", (req, res) => {
    // __dirname => 현재폴더 , 현재디렉토리를 의미함  //__filename 현재 파일을 의미
    fs.readFile(__dirname + "../data/member.json", "utf8", (err, data) => {
      if (!err) {
        console.log(data);
        res.writeHead(200, { "content-type": "text/json;charset=utf-8" });
        res.end(data);
      } else {
        console.log(err);
      }
    });
  });

  //127.0.0.1:3000/getMember/apple
  app.get("/getMember/:userid", (req, res) => {
    fs.readFile(__dirname + "/../data/member.json", "utf8", (err, data) => {
      if (!err) {
        const member = JSON.parse(data);
      } else {
        console.log(err);
      }
    });
  });
};
