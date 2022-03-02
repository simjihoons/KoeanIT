/* eslint-disable */

// import React from "react";
import "./App.css";
import Hello from "./components/hello";
import Wrapper from "./components/wrapper";

function App() {
  const name = "apple";

  const style = {
    backgroundColor: "deepskyblue",
    color: "red",
    fontSize: 40,
    padding: "1rem",
    width: "300px",
  };

  return (
    <Wrapper>
      {/* 외부 스타일 시트 */}
      <div className="deeppink-box">Hello</div>
      {/* 내부 스타일시트 */}
      <div style={style}>{name} Hello!!</div>
      <Hello name="apple" color="blue" />
      <Hello name="banana" color="gold" isSpacial={true} />{" "}
      {/* isSpacial={true} => isSpacial:상태를 저장이 되어 있는 변수  */}
    </Wrapper>
  );
}

export default App;
