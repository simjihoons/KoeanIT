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
  let [count, setCount] = useState(0);

  const PlusCount = () => {
    setCount(count + 1);
  };

  const ChangeTitle = () => {
    //state를 새로운 값에 넣어서 해야한다 ...은 spread 연산자 중괄호나 대괄호를 벗겨주세요~
    //완전 독립적인 array 복사본을 생성해주는 copy가 가능
    let newArray = [...title];
    newArray[0] = "여자 코트 추천";
    setTitle(newArray);
  };

  return (
    <div className="App">
      <div className="black-nav">
        {/* style을 주고 싶을때는 오브젝트 형식으로 넣어야함 */}
        <div style={{ color: "blue", fontSize: "30px" }}>개발 Blog</div>{" "}
      </div>

      <button onClick={ChangeTitle}>Title Change</button>
      {/* list */}
      <div className="list">
        {/* {title}<< 데이터바인딩  변수명 혹은 함수 등 */}
        {/* state에 여러 데이터가 들어가 있을때 인덱스를 붙여준다. */}
        <h4>
          {title[0]} <span onClick={PlusCount}>👍</span> {count}
        </h4>
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

      {/* 
      
      div 줄이기 Component!!!
      <div className="modal">
        <h2>Title</h2>
        <p>Date</p>
        <p>contents</p>
      </div> 
      
      */}
      <Modal />
    </div>
  );
}

// Component 만드는법
// 주의점 : 이름은 대문자로 시작 , return의 ()안에서는 div가 여러개 쓸 수 없다. (하나안에 넣어야한다)
// div 대신에 <> (Flagment문법) 를 쓸수 있다.
// 주로 반복적으로 출현하는 HTML 덩어리 , 자주 바뀌는 UI들을 Component로 만들면 좋다.
// 다른 페이지를 만들때도 컴포넌트로
function Modal() {
  return (
    <>
      <div className="modal">
        <h2>{props.title[1]}</h2>
        <p>Date</p>
        <p>contents</p>
      </div>
    </>
  );
}

export default App;
