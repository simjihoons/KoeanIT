import React from "react";
import "./App.css";
import {
  Navbar,
  Container,
  Nav,
  NavDropdown,
  Jumbotron,
  Button,
} from "react-bootstrap";

function App() {
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
          <div className="col-md-4">
            <img
              src="https://codingapple1.github.io/shop/shoes1.jpg"
              alt=""
              width="100%"
            />
            <h4>상품명</h4>
            <p>상품설명 &#38; 가격</p>
          </div>
          <div className="col-md-4">
            <img
              src="https://codingapple1.github.io/shop/shoes2.jpg"
              alt=""
              width="100%"
            />
            <h4>상품명</h4>
            <p>상품설명 &#38; 가격</p>
          </div>
          <div className="col-md-4">
            <img
              src="https://codingapple1.github.io/shop/shoes3.jpg"
              alt=""
              width="100%"
            />
            <h4>상품명</h4>
            <p>상품설명 &#38; 가격</p>
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
