import React from "react";
import styled from "styled-components";
import TodoItem from "./todoItem";
import { useTodoState } from "../todoContext";

const TodoListBlock = styled.div`
  flex: 1;
  padding: 20px 32px;
  padding-bottom: 48px;
  overflow-y: auto;
`;

function TodoList() {
  return (
    <TodoListBlock>
      {/* {Todos.map(todo => (//배열을 반복해서 출력
                     <TodoItem 
                        key={todo.id}
                        id={todo.id}
                        text={todo.text}
                        done={todo.done}
                     />
             ))} */}
      <TodoItem />
    </TodoListBlock>
  );
}

export default TodoList;
