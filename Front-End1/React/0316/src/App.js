import React from "react";
import { createGlobalStyle } from "styled-components";
//yarn add styled-components
import TodoTemplate from "./components/todoTemplate";
import TodoHead from "./components/todohead";
import TodoList from "./components/todolist";
import TodoCreate from "./components/todoCreate";
import { TodoProvider } from "./todoContext";

const GlobalStyle = createGlobalStyle`
    body {
      background-color: skyblue;
    }
`;

function App() {
  return (
    <>
      <TodoProvider>
        <GlobalStyle />
        <TodoTemplate>
          <TodoHead />
          <TodoList />
          <TodoCreate />
        </TodoTemplate>
      </TodoProvider>
    </>
  );
}

export default App;
