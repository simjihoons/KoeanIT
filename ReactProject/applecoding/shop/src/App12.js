/*eslint-disable*/
import React, { useContext, useState } from "react";
import "./App.css";
import {
  Navbar,
  Container,
  Nav,
  NavDropdown,
  Jumbotron,
  Button,
} from "react-bootstrap";

import data from "./data";

import { Link, Route, Switch } from "react-router-dom";

import Detail from "./Detail8";
import axios from "axios";

import Cart from "./Cart";

// -------------------------------------------------------
// createContext로 범위 생성 (같은 별수값을 공유할 범위 생성)
// detail에서도 쓸수 있게 export
export let 재고context = React.createContext();
// -------------------------------------------------------

function App() {
  let [shoes, setShoes] = useState(data);
  let [load, setLoad] = useState(true);

  //재고 데이터
  let [재고, 재고변경] = useState([10, 11, 12]);

  return (
    <div className="App">
      <Navbar bg="light" expand="lg">
        <Container>
          <Navbar.Brand href="#home">Shoeshops</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link as={Link} to="/">
                Home
              </Nav.Link>
              <Nav.Link as={Link} to="/detail">
                Detail
              </Nav.Link>
              <NavDropdown title="Dropdown" id="basic-nav-dropdown">
                <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
                <NavDropdown.Item href="#action/3.2">
                  Another action
                </NavDropdown.Item>
                <NavDropdown.Item href="#action/3.3">
                  Something
                </NavDropdown.Item>
                <NavDropdown.Divider />
                <NavDropdown.Item href="#action/3.4">
                  Separated link
                </NavDropdown.Item>
              </NavDropdown>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>

      {/*Switch 매치되는 <Route> 들을 전부 보여주지 말고 한번에 하나만 보여주세요~ 기능 */}
      <Switch>
        <Route exact path="/">
          {/* 
        배경이미지등은 public 폴더에도 저장이 가능하다 src폴더와의 차이점은
        src에 넣은  파일은 파일명 변경+ 압축됨
        public에 넣은 파일은 보존됨
        */}
          <Jumbotron className="background">
            <h1>20% Season off</h1>
            <p>
              This is a simple hero unit, a simple jumbotron-style component for
              calling extra attention to featured content or information.
            </p>
            <p>
              <Button variant="primary">Learn more</Button>
            </p>
          </Jumbotron>

          {/* bootstrap 문법 (pc버전에서는 열로 모바일 버전에선 행으로*/}
          <div className="container">
            {/* ------------------------------------------- */}

            <재고context.Provider value={재고}>
              <div className="row">
                {shoes.map((a, i) => {
                  return <Card shoes={shoes[i]} i={i} key={i} />;
                })}
              </div>
            </재고context.Provider>
            {/* ------------------------------------------- */}

            {/* ------------------------------------------------- */}
            {/* yarn add axios */}
            <button
              className="btn btn-more"
              onClick={() => {
                //axios.post("Server URL", { id: "codingapple", pw: 1234 });

                // Todo 로딩중 UI 띄움
                axios
                  .get("https://codingapple1.github.io/shop/data2.json") // get 요청
                  .then((result) => {
                    // Todo 로딩중 UI 삭제
                    console.log("서공");

                    let data = result.data;
                    setShoes([...shoes, ...data]);
                  }) //ajax 요청이 성공했을떄
                  .catch(() => {
                    //  Todo 로딩중 UI 삭제
                    console.log("실패");
                  }); //ajax 요청이 실패했을떄
              }}
            >
              More
            </button>
            {/* ------------------------------------------------- */}
          </div>
        </Route>

        <Route path="/detail/:id">
          <재고context.Provider value={재고}>
            <Detail shoes={shoes} 재고={재고} 재고변경={재고변경} />
          </재고context.Provider>
        </Route>

        <Route path="/cart">
          <Cart />
        </Route>

        <Route path="/:id">
          <div>아무거나 적음</div>
        </Route>
      </Switch>
    </div>
  );
}

function Card(props) {
  // ------------------------
  let 재고 = useContext(재고context);
  // ------------------------

  return (
    <>
      <div className="col-md-4">
        <img
          src={
            "https://codingapple1.github.io/shop/shoes" + (props.i + 1) + ".jpg"
          }
          alt=""
          width="100%"
        />
        <h4>{props.shoes.title}</h4>
        <p>
          {props.shoes.content} &#38; {props.shoes.price}&#36;
        </p>
        <Test></Test>
      </div>
    </>
  );
}
function Test() {
  let 재고 = useContext(재고context);
  return <p>{재고}</p>;
}

export default App;
