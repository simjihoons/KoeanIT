import React from "react";

function Hello({ name_02 }) {
  return (
    <>
      {/* <div>안녕하세요 {props.aaa}</div>
      <div>안녕하세요 {props.name}</div> */}
      <div>안녕하세요 {name_02}</div>
    </>
  );
}

Hello.defaultProps = {
  name_02: "이름없음",
};

export default Hello;
