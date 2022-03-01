import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./App6";
import reportWebVitals from "./reportWebVitals";

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById("root")
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

// 데이터 바인딩

// state문법
// 	1. 변수 대신 쓰는 데이터 저장 공간
// 	2. usestate()를 이용해서 만들어야함
// 	=> state에 데이터 저장해놓는 이유 : 웹이 App처럼 동작하게 만들고 싶어서 , state는 변경되면 HTML이 자동으로 재렌더링이 되기 때문(새로고침 없이도)

// 	리액트에선 UI를 만들 때 state 데이터를 이용한다.
