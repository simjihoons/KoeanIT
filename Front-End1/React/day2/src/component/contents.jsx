import React from "react";
import "./layouts.css";
import Con2 from "./con2";
function Contents() {
  return (
    <div className="contents">
      <div className="contents_in">
        <div className="con1">con1</div>
        <Con2 />
        <div className="con3">con3</div>
        <div className="con4">con4</div>
      </div>
    </div>
  );
}

export default Contents;
