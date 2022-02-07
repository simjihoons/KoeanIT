//npm i ejs

module.exports = (app) => {
  app.get("/", (req, res) => {
    console.log("module1.js 실행");

    res.render("index.ejs", { length: 10 }); // ejs파일에 변수값을 전달
  });

  app.get("/about", (req, res) => {
    res.render("about.html");
  });
};
