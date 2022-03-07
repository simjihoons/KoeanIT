import React, { useState } from "react";

function Input() {
  const [text, setText] = useState("");

  const onChange = (e) => {
    setText(e.target.value);
  };

  const onReset = () => {
    setText("");
  };

  return (
    <>
      <input onChange={onChange} value={text} />
      <button onClick={onReset}>reset</button>
      <div>
        <b>value : {text} </b>
      </div>
    </>
  );
}

export default Input;
