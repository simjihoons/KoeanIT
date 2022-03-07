import React from "react";
import "./layouts.css";

const style = {
  border: "3px solid red",
};

function Wrapper({ children }) {
  return <div style={style}>{children}</div>;
}

export default Wrapper;
