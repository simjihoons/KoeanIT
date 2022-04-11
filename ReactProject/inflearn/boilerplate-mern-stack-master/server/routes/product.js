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

  //검색기능
  let term = req.body.searchTerm;

  for (let key in req.body.filters) {
    //체크박스가 여러개 선택됬다면~
    if (req.body.filters[key].length > 0) {
      // console.log("key", key);
      if (key === "price") {
        findArgs[key] = {
          //$get , $lte는 몽고DB에서 사용하는 것
          //$0 to 199 => 0보다 크고 199보다 작고 이것들 때문에 하는것
          //[0][1] 은 [0,199] => 0 = 0 , 1 = 199 즉, 인덱스 번호

          $gte: req.body.filters[key][0], //$gte 이것보다 크거나 같고
          $lte: req.body.filters[key][1], //$lte 이것보다 작거나 같고
        };
      } else {
        findArgs[key] = req.body.filters[key];
      }
      // =======================
    }
  }

  if (term) {
    Product.find(findArgs)
      .find({ title: { $regex: term } })
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
  } else {
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
  }
});

router.get("/products_by_id", (req, res) => {
  //productID를 이용해서 DB에서 productID와 같은 상품의 정보를 가져온다.
  // 쿼리를 이용해서 데이터를 가져온다.
  let type = req.query.type;
  let productId = req.query.id;

  Product.find({ _id: productId })
    .populate("writer")
    .exec((err, product) => {
      if (err) return res.status(400).send(err);
      return res.status(200).send({ success: true, product });
    });
});

//axios.get(`/api/product/products_by_id?id=${productId}&type=single`);

module.exports = router;
