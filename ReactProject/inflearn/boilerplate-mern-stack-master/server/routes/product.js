const express = require("express");
const router = express.Router();
const multer = require("multer");

//=================================
//             Product
//=================================
const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    //   모든 파일이 uploads 폴더안에 들어감
    cb(null, "uploads/");
  },
  filename: function (req, file, cb) {
    cb(null, `${Date.now()}_${file.originalname}`);
  },
});

const upload = multer({ storage: storage }).single("file");

router.post("/image", (req, res) => {
  //todo
  //가져온 이미지를 저장 해주면됨.(multer 사용)
  //root 디렉토리에서 npm install multer
  upload(req, res, (err) => {
    if (err) {
      return req.json({ success: false, err });
    }
    return res.json({
      success: true,
      filePath: res.req.file.path,
      fileName: res.req.file.filename,
    });
  });
});
module.exports = router;
