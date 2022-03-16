import React from "react";
import Home from "./home";
import About from "./about";
import Profiles from "./profiles";
import { Route, Link } from "react-router-dom";

function App() {
  return (
    <>
      <ul>
        <li>
          <Link to="/">HOME</Link>
        </li>
        <li>
          <Link to="/about">About</Link>
        </li>
        <li>
          <Link to="/profiles">Profile</Link>
        </li>
      </ul>
      <hr />
      <div>
        <Route path="/" exact={true} component={Home}></Route>
        <Route path="/about" component={About}></Route>
        <Route path="/profiles" component={Profiles}></Route>
      </div>
    </>
  );
}

export default App;
