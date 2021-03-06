/* eslint-disable */

import { useState } from "react";
import logo from "./logo.svg";
import "./App.css";

function App() {
  let [글제목, 글제목변경] = useState([
    "남자 코트 추천",
    "부산 국밥",
    "든킨드나스",
    "파리바게뜨",
  ]);

  let [누른제목, 누른제목변경] = useState(0);

  let [따봉, 따봉변경] = useState(0);

  let posts = "강남 고기 맛집";

  // function 제목변경(){
  //   //글제목변경(["여자 코트 추천", "부산 국밥","든킨드나스","파리바게뜨",]);
  //   var newArray = [...글제목];
  //   newArray[0] = "여자 코트 추천"
  //   글제목변경(newArray);
  // }

  let [modal, modal변경] = useState(false);

  let [입력값, 입력값변경] = useState("");

  return (
    <div className="App">
      <div className="black-nav">
        <div>개발 Blog</div>
      </div>

      <div className="list">
        <h4>
          {글제목[0]}{" "}
          <span
            className="btn1"
            onClick={() => {
              따봉변경(따봉 + 1);
            }}
          >
            👍
          </span>
          {따봉}
        </h4>
        <p>2월 17일 발행</p>
        <hr />
      </div>

      {
        //1. for문 대신 쓸수 있는 map()
        글제목.map(function (title, i) {
          return (
            <div className="list" key={i}>
              <h1
                onClick={() => {
                  누른제목변경(i);
                }}
              >
                {title}
              </h1>
              <p>4월 17일 발행</p>
              <hr />
            </div>
          );
        })
      }

      {/* -----------------------------------------------------------------
        <div className="modal">
        <h2>제목</h2>
        <p>날짜</p>
        <p>상세내용</p>
        </div>
        
        아래와 같은 코드(컴포넌트 이용)
        Modal 함수 활용
        */}
      {/* 
      {입력값}
      <input
        onChange={(e) => {
          // console.log(e.target.value);
          입력값변경(e.target.value);
        }}
      /> */}

      <div className="publish">
        <input
          onChange={(e) => {
            입력값변경(e.target.value);
          }}
        />
        <button
          onClick={() => {
            var array = [...글제목];
            array.unshift(입력값); //unshift => array 맨앞에 자료 추가하는 문법
            글제목변경(array);
          }}
        >
          저장
        </button>
      </div>

      <button
        onClick={() => {
          modal변경(!modal);
        }}
      >
        열고닫기
      </button>

      {
        //{} 안에 if는 못쓰기 때문에 삼항연산자 이용

        modal === true ? <Modal 글제목={글제목} 누른제목={누른제목} /> : null
      }

      {/* ------------------------------------------------------------ */}
    </div> //end of App
  );
}

function Modal(props) {
  return (
    <>
      <div className="modal">
        <h2>{props.글제목[props.누른제목]}</h2>
        <p>날짜</p>
        <p>상세내용</p>
      </div>
    </>
  );
}

export default App;
