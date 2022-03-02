import React from "react";

function Hello(Props) {
  Props = { color: "gold", name: "김사과" };

  return (
    <>
      <div style={{ color: Props.color }}>Hello {Props.name}</div>
    </>
  );
}

export default Hello;
