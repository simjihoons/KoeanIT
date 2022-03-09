import React from "react";
import { createGlobalStyle } from "styled-components";

const GlobalStyle = createGlobalStyle`
body{
  background-color : #e9ecef;
}
`;

function App() {
  return (
    <>
      <GlobalStyle />
    </>
  );
}

export default App;
