const express = require("express");
const router = express.Router();
const multer = require("multer");
const { Product } = require("../models/Product");

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

// 값이 /api/product로 같이 때문에 /  ===========================================================
router.post("/", (req, res) => {
  //받아온 정보를 db에 넣는다.
  //product 모델을 가져와야함.
  //const {Product} ---

  const product = new Product(req.body);

  product.save((err) => {
    if (err) {
      return res.status(400).json({ success: false, err });
    }
    return res.status(200).json({ success: true });
  });
});

// 상품 리스트 랜딩 페이지=====================================================================
router.post("/products", (req, res) => {
  //랜딩 페이지 body 안에 limit , skip 이름과 동일하게
  let limit = req.body.limit ? parseInt(req.body.limit) : 20;
  let skip = req.body.skip ? parseInt(req.body.skip) : 0;

  //체크박스 만들기
  let findArgs = {};

  for (let key in req.body.filters) {
    //체크박스가 여러개 선택됬다면~
    if (req.body.filters[key].length > 0) {
      findArgs[key] = req.body.filters[key];
    }
  }

  // product collection에 들어있는 모든 상품 정보 가져오기
  // 조건이 들어갈때는 오브젝트 형식으로 작성 {price} ---
  // .populate => writer(사람)에 대한 모든 정보를  가져올수 있다.
  Product.find(findArgs)
    .populate("writer")
    .skip(skip)
    .limit(limit)
    .exec((err, productInfo) => {
      if (err) {
        return res.status(400).json({ success: false, err });
      }
      return res.status(200).json({
        success: true,
        productInfo,
        postSize: productInfo.length,
      });
    });

  //==> 랜딩 페이지 response.data.success/
});

module.exports = router;
