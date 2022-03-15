import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./App13";

import { BrowserRouter } from "react-router-dom";

// -----------------------------------------------------
//redux.
import { Provider } from "react-redux";
import { combineReducers, createStore } from "redux";

// -----------------------------------------------------
let alert초기값 = true;

function reducer2(state = alert초기값, 액션) {
  if (액션.type === "close") {
    return (state = false);
  } else {
    return state;
  }
}
// -----------------------------------------------------
let 초기값 = [
  {
    id: 0,
    name: "멋진신발",
    quan: 2,
  },
  {
    id: 1,
    name: "멋진신발",
    quan: 1,
  },
];

function reducer(state = 초기값, 액션) {
  if (액션.type === "항목추가") {
    let copy = [...state];
    copy.push(액션.payload);
    return copy;
  } else if (액션.type === "수량증가") {
    console.log("++");
    let copy = [...state];
    copy[0].quan++;
    return copy;
  } else if (액션.type === "수량감소") {
    console.log("--");
    let copy = [...state];
    if (copy[0].quan !== 0) {
      console.log("0이상");
      copy[0].quan--;
      return copy;
    } else {
      console.log("0이하");
      copy[0].quan = 0;
      return copy;
    }
  } else {
    console.log("default");
    return state;
  }
}

let store = createStore(combineReducers({ reducer, reducer2 }));
// ------------------------------------------------------

ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter>
      {/* redux0---------------------- */}
      <Provider store={store}>
        <App />
      </Provider>
      {/* -------------------------- */}
    </BrowserRouter>
  </React.StrictMode>,
  document.getElementById("root")
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
