import React, { useState } from "react";
import Box from "./components/box";
import CheckBox from "./components/CheckBox";

//yarn add styled-components
import styled, { css } from "styled-components";

const Circle = styled.div`
  width: 150px;
  height: 150px;
  // background: red;
  background:${(props) => props.color || "black"}}
  border-radius: 50%;
  ${(props) =>
    props.big &&
    css`
      width: 300px;
      height: 300px;
    `}
`;

function App() {
  const [check, setCheck] = useState(false);
  const onChange = (e) => {
    setCheck(e.target.checked);
  };

  return (
    <div>
      <Circle />
      <Circle color="deeppink" />
      <Circle color="deeppink" big />
      <p>Circle</p>

      <Box />

      <CheckBox onChange={onChange} checked={check}>
        약관에 모두 동의
      </CheckBox>
      <p>
        <b>check:</b>
        {check ? "true" : "false"}
      </p>
    </div>
  );
}
export default App;
