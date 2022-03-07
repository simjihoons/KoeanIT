/* eslint-disable array-callback-return */
import React from "react";

function User({ user }) {
  return (
    <div>
      <b>{user.username}</b>
      <br></br>
      <span>{user.email}</span>
    </div>
  );
}

function UserList() {
  const users = [
    {
      id: 1,
      username: "김사과",
      email: "apple@apple.com",
    },
    {
      id: 2,
      username: "오렌지",
      email: "orange@orange.com",
    },
    {
      id: 3,
      username: "반하나",
      email: "banana@banana.com",
    },
    {
      id: 4,
      username: "이메론",
      email: "melon@melon.com",
    },
    {
      id: 5,
      username: "배애리",
      email: "berry@berry.com",
    },
  ];

  return (
    <>
      <div>
        {/* <User user={users[0]} /> <br />
        <User user={users[1]} /> <br />
        <User user={users[2]} /> <br /> */}
        {users.map((user, i) => {
          <User user={users} key={i} />;
        })}
      </div>
    </>
  );
}

export default UserList;
