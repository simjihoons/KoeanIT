import React from "react";
//import { useTodoState } from "../todoContext";

function TodoHead() {
  // const todos = useTodoState();
  // const undoneTasks = todos.filter((todo) => !todo.done);
  const today = new Date();
  const dataString = today.toLocaleDateString("ko-KR", {
    year: "numeric",
    month: "long",
    day: "numeric",
  });

  const dayName = today.toLocaleDateString("ko-KR", { weekday: "long" });

  return (
    <>
      <h1>{dataString}</h1>
      <div className="day">{dayName}</div>
      {/* <div className="tasks-left">할 일 {undoneTasks.length}</div> */}
    </>
  );
}

export default TodoHead;
