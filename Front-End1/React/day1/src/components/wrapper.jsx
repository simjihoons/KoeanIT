function Wrapper({ children }) {
  const style = {
    border: "3px solid red",
    padding: "10px",
    backgroundColor: "#ccc",
  };

  return (
    <>
      <div style={style}>{children}</div>
    </>
  );
}

export default Wrapper;
