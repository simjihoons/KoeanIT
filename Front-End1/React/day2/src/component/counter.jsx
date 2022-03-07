import React, { useState } from "react";

function Counter() {
  //   객체형
  const plus = () => {
    console.log("Call plus()");
    console.log("+1");
    setNum(num + 1);
  };
  const minus = () => {
    console.log("Call minus()");
    console.log("-1");
    setNum(num - 1);
  };

  const [num, setNum] = useState(0);

  return (
    <>
      <h2>count</h2>
      <p>{num}</p>
      <button onClick={plus}>plus</button> &nbsp;&nbsp;
      <button onClick={minus}>minus</button>
    </>
  );
}

export default Counter;
