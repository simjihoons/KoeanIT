import React, { useEffect, useState } from "react";
import { FaCode } from "react-icons/fa";

// 백엔드에 요청을 보내기위해
import axios from "axios";

// Card 디자인
import { Icon, Col, Card, Row } from "antd";
import Meta from "antd/lib/card/Meta";

//이미지 슬라이더
import ImageSlider from "../../utils/ImageSlider";

function LandingPage() {
  const [Products, setProducts] = useState([]);
  const [Skip, setSkip] = useState(0);
  const [Limit, setLimit] = useState(8); //화면에 8개만 보여주기

  useEffect(() => {
    let body = {
      skip: Skip,
      limit: Limit,
    };

    axios.post("/api/product/products", body).then((response) => {
      if (response.data.success) {
        console.log(response.data);
        setProducts(response.data.productInfo);
      } else {
        alert("상품들을 가져오는데 실패");
      }
    });
  }, []);

  const loadMoreHandler = () => {
    //   skip 과 limit은 state로 관리
  };

  const renderCards = Products.map((product, index) => {
    return (
      // 제일 큰 화면일때 총 24 사이즈에서 4개를 나오게 하기위해 lg ={6}
      // 중간정도 화면일때 3개 나오게 하기 위해 md={8}
      // 모바일용으로 하나당 24사이즈
      <Col lg={6} md={8} xs={24} key={index}>
        <Card cover={<ImageSlider images={product.images} />}>
          <Meta title={product.title} description={`${product.price}`} />
        </Card>
      </Col>
    );
  });

  return (
    <>
      <div style={{ width: "75%", margin: "3rem auto" }}>
        <div style={{ textAlign: "center" }}>
          <h2>
            Let's Travel Anywhere <Icon type="rocket" />
          </h2>
        </div>

        {/* Filter */}

        {/* Search */}

        {/* Card */}
        {/* gutter =>이미지들  사이에 여백을  주기위해 */}
        <Row gutter={[16, 16]}>{renderCards}</Row>

        <div style={{ justifyContent: "center" }}>
          <button onClick={loadMoreHandler}>더보기</button>
        </div>
      </div>
    </>
  );
}

export default LandingPage;
