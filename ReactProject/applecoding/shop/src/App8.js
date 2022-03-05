/*eslint-disable*/
import React, { useState } from "react";
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

import Detail from "./Detail3";

function App() {
  let [shoes, setShoes] = useState(data);

  return (
    <div className="App">
      <Navbar bg="light" expand="lg">
        <Container>
          <Navbar.Brand href="#home">Shoeshop</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              {/*------------- Link------------------  */}
              <Nav.Link>
                <Link to="/">Home</Link>
              </Nav.Link>
              <Nav.Link>
                <Link to="/detail">Detail</Link>
              </Nav.Link>
              {/*----------------Link---------------  */}
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
            <div className="row">
              {shoes.map((a, i) => {
                return <Card shoes={shoes[i]} i={i} key={i} />;
              })}
            </div>
          </div>
        </Route>

        {/* -------------------------------------------------------------- */}
        {/* 1번째,2번째,3번째 이미지와 컨텐츠 내용을 다르게 하기 위해 /:id 사용 */}
        {/* : 뒤에 마음대로 작명할수 있다. */}
        <Route path="/detail/:id">
          <Detail shoes={shoes} />
        </Route>
        {/* -------------------------------------------------------------- */}

        <Route path="/:id">
          {/* /:id => /모든문자라는 경로를 의미한다. */}
          <div>아무거나 적음</div>
        </Route>
      </Switch>
    </div>
  );
}

function Card(props) {
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
      </div>
    </>
  );
}
export default App;
