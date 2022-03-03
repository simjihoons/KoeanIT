/*eslint-disable */
// 컴포넌트 파일은 앞이 대문자여야 한다.
import React, { useState } from "react";
import { useHistory } from "react-router-dom";

function Detail() {
  let history = useHistory(); //방문기록 등을 저장한 오브젝트

  return (
    <>
      <div className="container">
        <div className="row">
          <div className="col-md-6">
            <img
              src="https://codingapple1.github.io/shop/shoes1.jpg"
              width="100%"
            />
          </div>
          <div className="col-md-6 mt-4">
            <h4 className="pt-5">상품명</h4>
            <p>상품설명</p>
            <p>120000원</p>
            <button className="btn btn-danger">주문하기</button>
            <button
              className="btn btn-danger"
              onClick={() => {
                // history.goBack();
                //         or
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
