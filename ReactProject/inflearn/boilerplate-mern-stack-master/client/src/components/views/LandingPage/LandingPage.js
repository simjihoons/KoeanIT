import React, { useEffect, useState } from "react";
import { FaCode } from "react-icons/fa";

// 백엔드에 요청을 보내기위해
import axios from "axios";

// Card 디자인
import { Icon, Col, Card, Row } from "antd";
import Meta from "antd/lib/card/Meta";

//이미지 슬라이더
import ImageSlider from "../../utils/ImageSlider";

//체크박스
import Checkbox from "./Sections/CheckBox";
import { continents } from "./Sections/Datas";

function LandingPage() {
  const [Products, setProducts] = useState([]);
  const [Skip, setSkip] = useState(0);
  const [Limit, setLimit] = useState(8); //화면에 8개만 보여주기

  const [PostSize, setPostSize] = useState(0);

  const [Filters, setFilters] = useState({
    continents: [],
    price: [],
  });

  useEffect(() => {
    let body = {
      skip: Skip,
      limit: Limit,
    };
    getProducts(body);
  }, []);

  const getProducts = (body) => {
    axios.post("/api/product/products", body).then((response) => {
      if (response.data.success) {
        if (body.loadMore) {
          //만약 더보기 버튼을 눌렀다면~
          setProducts([...Products, ...response.data.productInfo]);
        } else {
          setProducts(response.data.productInfo);
        }
        setPostSize(response.data.postSize);
      } else {
        alert("상품들을 가져오는데 실패");
      }
    });
  };

  const loadMoreHandler = () => {
    //   skip 과 limit은 state로 관리

    //처음 더보기를 누르면 0 + 8
    //두번째는 8 + 8
    let skip = Skip + Limit;

    let body = {
      skip: skip,
      limit: Limit,
      loadMore: true,
    };

    getProducts(body);
    setSkip(skip);
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

  const showFilteredResults = (filters) => {
    let body = {
      skip: 0, //체크박스를 여러개 누를때마다 다시 시작해야하기 때문
      limit: Limit,
      filters: filters,
    };

    getProducts(body);
    setSkip(0);
  };

  const handleFilters = (filters, category) => {
    const newFilters = { ...Filters };

    newFilters[category] = filters;

    showFilteredResults(newFilters);
  };

  return (
    <>
      <div style={{ width: "75%", margin: "3rem auto" }}>
        <div style={{ textAlign: "center" }}>
          <h2>
            Let's Travel Anywhere <Icon type="rocket" />
          </h2>
        </div>

        {/* Filter start=============*/}
        {/* checkBox */}
        <Checkbox
          list={continents}
          handleFilters={(filters) => handleFilters(filters, "continents")}
        />
        {/* radioBox */}
        {/* Filter end=============*/}
        {/* Search */}

        {/* Card */}
        {/* gutter =>이미지들  사이에 여백을  주기위해 */}
        <Row gutter={[16, 16]}>{renderCards}</Row>

        {PostSize >= Limit && (
          <div style={{ justifyContent: "center" }}>
            <button onClick={loadMoreHandler}>더보기</button>
          </div>
        )}
      </div>
    </>
  );
}

export default LandingPage;
