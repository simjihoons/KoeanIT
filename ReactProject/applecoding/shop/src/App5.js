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
              <Nav.Link href="#home">Home</Nav.Link>
              <Nav.Link href="#link">Link</Nav.Link>
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
      <Route path="/detail">
        <div className="container">
          <div className="row">
            <div className="col-md-6">
              <img
                src="https://codingapple1.github.io/shop/shoes1.jpg"
                width="100%"
              />
            </div>
            <div className="col-md-6 mt-4">
              <h4 className="pt-5">상품명</h4>
              <p>상품설명</p>
              <p>120000원</p>
              <button className="btn btn-danger">주문하기</button>
            </div>
          </div>
        </div>
      </Route>
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
          {props.shoes.content} &#38; {props.shoes.price}
        </p>
      </div>
    </>
  );
}
export default App;
