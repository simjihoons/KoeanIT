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
  const Todos = useTodoState();

  return (
    <TodoListBlock>
      {Todos.map(
        (
          todo //배열을 반복해서 출력
        ) => (
          <TodoItem
            key={todo.id}
            id={todo.id}
            text={todo.text}
            done={todo.done}
          />
        )
      )}
      {/* <TodoItem text="프로젝트 생성하기" done={true} />
      <TodoItem text="컴포넌트 스타일링 하기" done={true} />
      <TodoItem text="Context 만들기 " done={false} />
      <TodoItem text="기능 구현하기" done={false} /> */}
    </TodoListBlock>
  );
}

export default TodoList;
