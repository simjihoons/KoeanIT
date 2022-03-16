import React from "react";
import { Route, Link } from "react-router-dom";
import Profile from "./profile";
const Profiles = () => {
  return (
    <>
      <h1>User List</h1>
      <ul>
        <li>
          <Link to="/profiles/apple">apple</Link>
        </li>
        <li>
          <Link to="/profiles/banana">banana</Link>
        </li>
      </ul>

      <Route
        path="/profiles"
        exact
        render={() => {
          return <div>유저를 선택하세요</div>;
        }}
      ></Route>
      <Route path="/profiles/:usename" component={Profile} />
    </>
  );
};

export default Profiles;
