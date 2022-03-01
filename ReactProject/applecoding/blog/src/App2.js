import logo from "./logo.svg";
import "./App.css";

function App2() {
  let posts = "강남 고기 맛집";

  return (
    <div className="App">
      <div className="black-nav">
        {/* style을 주고 싶을때는 오브젝트 형식으로 넣어야함 */}
        <div style={{ color: "blue", fontSize: "30px" }}>개발 Blog</div>{" "}
      </div>
      <h4>{posts}</h4> {/*<< 바인딩  변수명 혹은 함수 등 */}
    </div>
  );
}

export default App2;
