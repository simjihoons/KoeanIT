import React, { useState, useRef } from "react";

function MultiInput() {
  const [inputs, setInputs] = useState({
    userid: "",
    name: "",
  });

  const useridInput = useRef(); // useRef 특정 dom 선택하기
  const { userid, name } = inputs;
  const onChange = (e) => {
    const { value, name } = e.target; //e.target에서 name 과 value를 가져옴
    setInputs({
      ...inputs,
      [name]: value, //name 키를 가진 값을 value로 설정
    });
  };

  const onReset = () => {
    setInputs({
      userid: "",
      name: "",
    });
    useridInput.current.focus();
  };

  return (
    <>
      <input
        name="useid"
        onChange={onChange}
        value={userid}
        placeholder="ID"
        ref={useridInput}
      />
      <input name="name" onChange={onChange} placeholder="NAME" value={name} />
      <button onClick={onReset}>reset</button>
      <div>
        <b>ID : {userid} </b>
        <b>NAME : {name} </b>
      </div>
    </>
  );
}

export default MultiInput;
