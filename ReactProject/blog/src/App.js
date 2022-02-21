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

  let [따봉, 따봉변경] = useState(0);

  let posts = "강남 고기 맛집";

  // function 제목변경(){
  //   //글제목변경(["여자 코트 추천", "부산 국밥","든킨드나스","파리바게뜨",]);
  //   var newArray = [...글제목];
  //   newArray[0] = "여자 코트 추천"
  //   글제목변경(newArray);
  // }

  return (
    <div className="App">
      <div className="black-nav">
        <div>개발 Blog</div>
      </div>

      <div className="list">
        <h4>
          {글제목[0]} <span className="btn1" onClick={()=>{
            따봉변경(따봉+1);
          }}>👍</span>
          {따봉}
        </h4>
        <p>2월 17일 발행</p>
        <hr />
      </div>

      <div className="list">
        <h1>{글제목[1]}</h1>
        <p>3월 17일 발행</p>
        <hr />
      </div>

      <div className="list">
        <h1>{글제목[2]}</h1>
        <p>3월 17일 발행</p>
        <hr />
      </div>

      <div className="list">
        <h1>{글제목[3]}</h1>
        <p>4월 17일 발행</p>
        <hr />
      </div>

   
      {/* -----------------------------------------------------------------
        <div className="modal">
        <h2>제목</h2>
        <p>날짜</p>
        <p>상세내용</p>
        </div>
        
        아래와 같은 코드(컴포넌트 이용)
        Modal 함수 활용
        */}
        
        <Modal />
          
        
      {/* ------------------------------------------------------------ */}
    </div> //end of App
  );
}
 
function Modal() {
  return (
    <>
    <div className="modal">
      <h2>제목</h2>
      <p>날짜</p>
      <p>상세내용</p>
    </div>
  </>
  );
}


export default App;
