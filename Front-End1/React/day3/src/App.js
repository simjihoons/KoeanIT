import React from "react";
import { createGlobalStyle } from "styled-components";
import TodoHead from "./component/todoHead";
import TodoList from "./component/todolist";
import TodoTemplate from "./component/todotemplate";
const GlobalStyle = createGlobalStyle`
body{
  background-color : #e9ecef;
}
`;

function App() {
  return (
    <>
      <GlobalStyle />
      <TodoTemplate>
        <TodoHead />
        <TodoList />
      </TodoTemplate>
    </>
  );
}

export default App;
