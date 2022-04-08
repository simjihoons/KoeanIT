import React, { useState } from "react";
import Dropzone from "react-dropzone";
import { Icon } from "antd";
import axios from "axios";

function FileUpload() {
  const [Images, setImages] = useState([]);

  const dropHandler = (files) => {
    // formData안에는 보낼 파일의 정보가 append를 이용해서 담김
    let formData = new FormData();

    const config = {
      //어떤 파일인지 content-type을 정해서 백에서 이 req를 받으면 에러가 안나게끔 함.
      header: { "content-type": "multipart/fomr-data" },
    };

    formData.append("file", files[0]);

    // formData와 config 를 같이 보내주지않으면 파일을 보낼때 에러가 발생한다.
    axios.post("/api/product/image", formData, config).then((response) => {
      if (response.data.success) {
        console.log(response.data);
        setImages([...Images, response.data.filePath]);
      } else {
        alert("파일을 저장하는데 실패했습니다.");
      }
    });
  };

  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-between",
        cursor: "pointer",
      }}
    >
      {/* onDrop={(acceptedFiles) => console.log(acceptedFiles)} */}
      <Dropzone onDrop={dropHandler}>
        {({ getRootProps, getInputProps }) => (
          <div
            style={{
              width: 300,
              height: 240,
              border: "1px solid lightgray",
              display: "flex",
              alignItems: "center",
              justifyContent: "center",
            }}
            {...getRootProps()}
          >
            <input {...getInputProps()} />
            <Icon type="plus" style={{ fontSize: "3rem" }} />
          </div>
        )}
      </Dropzone>

      <div
        style={{
          display: "flex",
          width: "350px",
          height: "240px",
          overflowX: "scroll",
        }}
      >
        {Images.map((image, i) => (
          <div key={i}>
            <img
              style={{ minWidth: "300px", width: "300px", height: "240px" }}
              src={`http://localhost:5000/${image}`}
            />
          </div>
        ))}
      </div>
    </div>
  );
}

export default FileUpload;
