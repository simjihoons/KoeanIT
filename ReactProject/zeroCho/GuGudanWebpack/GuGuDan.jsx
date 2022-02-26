const React = require("react");
const { useState, useRef } = React;

const GuGudan = () => {
  const [first, setFirst] = useState(Math.ceil(Math.random() * 9));
  const [second, setSecond] = useState(Math.ceil(Math.random() * 9));
  const [value, setValue] = useState("");
  const [result, setResult] = useState("");
  const inputRef = useRef(null);

  const onChangeInput = (e) => {
    setValue(e.target.value);
  };

  const onSubmitForm = (e) => {
    e.preventDefault();

    if (parseInt(value) === first * second) {
      setResult(value + " 정답👍");
      setFirst(Math.ceil(Math.random() * 9));
      setSecond(Math.ceil(Math.random() * 9));
      setValue("");

      //Hooks 에서 ref는 current를 붙여야 한다.
      inputRef.current.focus();
    } else {
      setResult("❌땡❌");
      setValue("");
    }
    //Hooks 에서 ref는 current를 붙여야 한다.
    inputRef.current.focus();
  };
  return (
    <>
      <div>
        {first} 곱하기 {second}는?
      </div>
      <form onSubmit={onSubmitForm}>
        <input ref={inputRef} onChange={onChangeInput} value={value} />
        <button>입력</button>
        <div>{result}</div>
      </form>
    </>
  );
};

module.exports = GuGudan;
