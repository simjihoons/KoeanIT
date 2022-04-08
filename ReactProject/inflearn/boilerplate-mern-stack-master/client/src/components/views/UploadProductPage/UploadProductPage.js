import React, { useState } from "react";
import { Typography, Button, Form, Input } from "antd";
import FileUpload from "../../utils/FileUpload";

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

function UploadProductPage() {
  // 업로드 상품 이름
  const [uploadTitle, setUploadTitle] = useState("");
  // 업로드 상품 설명
  const [discription, setdiscription] = useState("");
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

  const discriptionChangeHandler = (e) => {
    setdiscription(e.currentTarget.value);
  };

  const priceChangeHandler = (e) => {
    setprice(e.currentTarget.value);
  };

  const continentChangeHandler = (e) => {
    setcontinent(e.currentTarget.value);
  };
  return (
    <>
      <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
        <div style={{ textAlign: "center", marginBottom: "2rem" }}>
          {/* level 은 글씨 크기  1이 제일 큼*/}
          <Title level={2}>여행 상품 업로드</Title>
        </div>

        <form>
          {/* DropZone */}
          <FileUpload />
          <br />
          <br />
          <label>이름</label>
          {/* value에 따라 값이 들어간다. */}
          <Input onChange={titleChangeHandler} value={uploadTitle} />
          <br />
          <br />
          <label>설명</label>
          <TextArea onChange={discriptionChangeHandler} value={discription} />
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
          <Button>확인</Button>
        </form>
      </div>
    </>
  );
}

export default UploadProductPage;
