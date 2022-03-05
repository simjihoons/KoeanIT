/*eslint-disable */
// 컴포넌트 파일은 앞이 대문자여야 한다.
import React, { useState } from "react";
import { useHistory, useParams } from "react-router-dom";
import styled from "styled-components";
import "./Detail4.scss";

// ----------------------------------------------
let 박스 = styled.div`
  padding: 20px;
`;
// ----------------------------------------------
let 제목 = styled.h4`
  font-size: 30px;
  color: ${(props) => props.색상};
`;

// ----------------------------------------------

function Detail(props) {
  let history = useHistory(); //방문기록 등을 저장한 오브젝트
  let { id } = useParams(); //리액트 훅

  let 찾은상품 = props.shoes.find(function (상품) {
    return 상품.id == id;
  });

  return (
    <>
      <div className="container">
        {/* ------------------------------------ */}
        <박스>
          <제목 className="red">Detail Page</제목>
          <제목 색상={"blue"}>Detail Page</제목>
        </박스>

        <div className="my-alert3">
          <p>재고가 얼마 남지 않음</p>
        </div>
        {/* ------------------------------------ */}

        <div className="row">
          <div className="col-md-6">
            <img
              src={
                "https://codingapple1.github.io/shop/shoes" +
                (parseInt(id) + 1) +
                ".jpg"
              }
              width="100%"
            />
          </div>
          <div className="col-md-6 mt-4">
            <h4 className="pt-5">{찾은상품.title}</h4>
            <p>{찾은상품.content}</p>
            <p>{찾은상품.price}원</p>
            <button className="btn btn-danger">주문하기</button>
            <button
              className="btn btn-danger"
              onClick={() => {
                // history.goBack();
                //        or
                history.push("/");
              }}
            >
              뒤로가기
            </button>
          </div>
        </div>
      </div>
    </>
  );
}

export default Detail;
