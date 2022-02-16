const express = require("express");
const bodyParser = require("body-parser");

const static = require("serve-static"); //npm i serve-static
const path = require("path");
const logger = require("morgan"); // npm i morgan
const multer = require("multer"); // npm i multer

const port = 3000;
const app = express();
const router = express.Router();

app.use(bodyParser.urlencoded({ extended: false }));

//특정폴더의 주소를 지정
app.use("/public", static(path.join(__dirname, "public"))); // __dirname => 현재 폴더 , 파일을 첨부할 html이 있는 경로 주소 설정
app.use("/uploads", static(path.join(__dirname, "uploads"))); // 첨부된 파일이 저장되는 경로 설정
app.use(logger("dev"));

const storage = multer.diskStorage({
  //파일 저장할 디렉토리 설정
  destination: (req, file, callback) => {
    callback(null, "uploads");
  },
  filename: (req, file, callback) => {
    const extension = path.extname(file.originalname); //원래 파일명 apple.png이 extension에 저장됨
    const basename = path.basename(file.originalname, extension); // 파일명만 추출 apple
    callback(null, basename + "_" + Date.now() + extension); //apple_1215420451.png
  },
});

const upload = multer({
  storage: storage,
  limit: {
    files: 5,
    fileSzie: 1024 * 1024 * 100,
  },
});

// http://localhost:3000/write
router.route("/write").post(upload.array("photo", 1), (req, res) => {
  console.log("Call /write!!");

  try {
    const title = req.body.title;
    const content = req.body.content;
    const files = req.files;
    console.dir(req.files[0]);

    //첨부된 파일에 대한 속성
    files[0].originalname;
    const originalname = files[0].originalname;
    const filename = files[0].filename;
    const mimetype = files[0].mimetype;
    const size = files[0].size;

    console.log(
      `파일정보 : 원본파일명 : ${originalname}, 파일이름:${filename},mimtype:${mimetype}, 파일크기:${size}`
    );

    res.writeHead(200, { "content-type": "text/html;charset=utf8" });
    res.write("<h2>File Upload Success!!</h2>");
    res.write("<hr>");
    res.write(`<p>Title : ${title}</p>`);
    res.write(`<p>content : ${content}</p>`);
    res.write(`<p>원본파일명 : ${originalname}</p>`);
    res.write(`<p>파일명 : ${filename}</p>`);
    res.write(`<p>mimetype : ${mimetype}</p>`);
    res.write(`<p>FileSize : ${size}</p>`);
    res.write(`<p><img src="/uploads/${filename}" width="200"></p>`);
    res.end();
  } catch (e) {
    console.log(e);
  }
});

app.use("/", router);

app.listen(port, () => {
  console.log(`${port}로 서버 실행중...`);
});
