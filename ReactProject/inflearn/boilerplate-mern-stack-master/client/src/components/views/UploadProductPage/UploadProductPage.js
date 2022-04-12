import React, { useState } from "react";
import { Typography, Button, Form, Input } from "antd";
import FileUpload from "../../utils/FileUpload";
import Axios from "axios";

const { Title } = Typography;
const { TextArea } = Input;

const Continent = [
  { key: 1, value: "Africa" },
  { key: 2, value: "Europe" },
  { key: 3, value: "Asia" },
  { key: 4, value: "North America" },
  { key: 5, value: "South America" },
  { key: 6, value: "Australia" },
  { key: 7, value: "Antarctica" },
];

function UploadProductPage(props) {
  // 업로드 상품 이름
  const [uploadTitle, setUploadTitle] = useState("");
  // 업로드 상품 설명
  const [description, setdescription] = useState("");
  // 업로드 상품 가격
  const [price, setprice] = useState(0);
  //select
  const [continent, setcontinent] = useState(1);
  //image
  const [images, setimages] = useState([]);

  //   input , textArea 에 onChange를 쓰기위해
  const titleChangeHandler = (e) => {
    setUploadTitle(e.currentTarget.value);
  };

  const descriptionChangeHandler = (e) => {
    setdescription(e.currentTarget.value);
  };

  const priceChangeHandler = (e) => {
    setprice(e.currentTarget.value);
  };

  const continentChangeHandler = (e) => {
    setcontinent(e.currentTarget.value);
  };

  const updateImages = (newImages) => {
    setimages(newImages);
  };

  const submitHandler = (e) => {
    e.preventDefault();

    if (!uploadTitle || !description || !price || !continent || !images) {
      // 상품 업로드 페이지의 모든 칸이 채워지지않으면 실패
      return alert("모든 정보를 입력하셔야 합니다.");
    }

    //post request로 보내기 때문에 body가 필요
    const body = {
      //로그인된 사람의 ID
      // hoc => auth.js(부모) 로 만들기 위해 props를 사용
      writer: props.user.userData._id,
      title: uploadTitle,
      description: description,
      price: price,
      images: images,
      continents: continent,
    };

    // 서버에 채운 값들을 request 로 보낸다.
    Axios.post("/api/product", body).then((response) => {
      // 백에서 처리한 값을 response에 넣는다.
      if (response.data.success) {
        alert("상품 업로드 성공");

        // 성공 후 자동으로 페이지를 home으로
        props.history.push("/");
      } else {
        alert("상품 업로드 실패");
      }
    });
  };

  return (
    <>
      <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
        <div style={{ textAlign: "center", marginBottom: "2rem" }}>
          {/* level 은 글씨 크기  1이 제일 큼*/}
          <Title level={2}>여행 상품 업로드</Title>
        </div>

        <Form onSubmit={submitHandler}>
          {/* DropZone */}

          {/* upload 의 파일정보를 부모컨포넌트로 업데이트  */}
          <FileUpload refreshFunction={updateImages} />

          <br />
          <br />
          <label>이름</label>
          {/* value에 따라 값이 들어간다. */}
          <Input onChange={titleChangeHandler} value={uploadTitle} />
          <br />
          <br />
          <label>설명</label>
          <TextArea onChange={descriptionChangeHandler} value={description} />
          <br />
          <br />
          <label>가격($)</label>
          <Input type="number" onChange={priceChangeHandler} value={price} />
          <br />
          <br />
          <select onChange={continentChangeHandler} value={continent}>
            {Continent.map((item) => (
              <option key={item.key} value={item.key}>
                {item.value}
              </option>
            ))}
          </select>
          <br />
          <br />
          <Button htmlType="submit">확인</Button>
        </Form>
      </div>
    </>
  );
}

export default UploadProductPage;
