/*eslint-disable */
// 컴포넌트 파일은 앞이 대문자여야 한다.
import React, { useEffect, useState, useContext } from "react";
import { useHistory, useParams } from "react-router-dom";
import styled from "styled-components";
import "./Detail4.scss";
import { 재고context } from "./App12";

let 박스 = styled.div`
  padding: 20px;
`;
let 제목 = styled.h4`
  font-size: 30px;
  color: ${(props) => props.색상};
`;

// ----------------------------------------------
//Lifecycle Hook
// class Detail2 extends React.Component {
//   //이 컴포넌트가 마운트가 되었을때 실행할 코드
//   componentDidMount() {
//     //Ajax같은것도 여기서 사용가능
//   }

//   //이 컴포넌트가 마운트가 해제 되었을때 실행할 코드
//   componentWillUnmount() {}
// }

//요즘은 useEffect 훅을 쓴다.

// ----------------------------------------------

function Detail(props) {
  let [alert, setAlert] = useState(true);
  let [inputData, setInputData] = useState("");
  let 재고 = useContext(재고context);
  useEffect(() => {
    //컴포넌트가 mount, update가 될때 특정코드 사용
    //2초 후에 alert창 닫기(안보이게)
    let timer = setTimeout(() => {
      setAlert(false);
    }, 2000);

    return () => {
      clearTimeout(timer); //Detail 컴포넌트가 사라질때 timer 제거 (버그 예방)
    };

    //return은 unmount가 될때 실행함
    // return function name() {};
  }, []); // [] 안에 조건을 넣을수가 있다. [alert]이면alert가 실행될때만 실행해라 !
  // 빈칸이면 Detail 페이지가 실행됬을때 1번만 실행

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

        {inputData}
        <input
          onChange={(e) => {
            setInputData(e.target.value);
          }}
        />

        {alert == true ? (
          <div className="my-alert3">
            <p>재고가 얼마 남지 않음</p>
          </div>
        ) : null}
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

            {/* 재고 */}
            <Info 재고={props.재고}></Info>

            <button
              className="btn btn-danger"
              onClick={() => {
                let c재고 = [...props.재고];
                c재고변경(c재고 - 1);
                props.재고변경(c재고변경);
              }}
            >
              주문하기
            </button>
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
      {재고}
    </>
  );
}

function Info(props) {
  return (
    <>
      <p>재고 : {props.재고[0]} 켤레 </p>
    </>
  );
}

export default Detail;
