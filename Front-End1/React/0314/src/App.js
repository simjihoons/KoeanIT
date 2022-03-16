import React from "react";
import { createGlobalStyle } from "styled-components";
//yarn add styled-components
import TodoTemplate from "./components/todoTemplate";
import TodoHead from "./components/todohead";
import TodoList from "./components/todolist";

const GlobalStyle = createGlobalStyle`
    body {
      background-color: skyblue;
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
