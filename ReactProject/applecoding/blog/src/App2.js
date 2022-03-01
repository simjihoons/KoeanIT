/* eslint-disable */
import "./App.css";
import React, { useState } from "react";

function App() {
  let [titleTest, setTitleTest] = useState("남자 코트 추천"); //state 만드는법 [a,b] 이렇게 만들어지며 a = 남자코드-- , b = 수정을위한 함수

  //state에 여러 데이터를 넣고 싶을때
  let [title, setTitle] = useState([
    "남자 코드 추천",
    "강남 우동 맛집",
    "제목1",
    "제목2",
  ]);

  let posts = "강남 고기 맛집";

  return (
    <div className="App">
      <div className="black-nav">
        {/* style을 주고 싶을때는 오브젝트 형식으로 넣어야함 */}
        <div style={{ color: "blue", fontSize: "30px" }}>개발 Blog</div>{" "}
      </div>

      {/* list */}
      <div className="list">
        {/* {title}<< 데이터바인딩  변수명 혹은 함수 등 */}
        {/* state에 여러 데이터가 들어가 있을때 인덱스를 붙여준다. */}
        <h4>{title[0]}</h4>
        <p>2월 17일 발행</p>
        <hr />
      </div>
      {/* ------------------------------------------------------------- */}
      <div className="list">
        <h4>{title[1]}</h4>
        <p>2월 17일 발행</p>
        <hr />
      </div>
      <div className="list">
        <h4>{title[2]}</h4>
        <p>2월 17일 발행</p>
        <hr />
      </div>
      <div className="list">
        <h4>{title[3]}</h4>
        <p>2월 17일 발행</p>
        <hr />
      </div>
    </div>
  );
}

export default App;
