import React, { useRef, useState, useMemo } from "react";
import UserList from "./component/userlist02";
import CreateUser from "./component/CreateUser";

function countActiveUsers(users) {
  console.log("활성 사용자 수를 세는중...");
  return users.filter((user) => user.active).length;
}

function App() {
  const [inputs, setInputs] = useState({
    username: "",
    email: "",
  });
  const { username, email } = inputs;
  const onChange = (e) => {
    const { name, value } = e.target;
    setInputs({
      ...inputs,
      [name]: value,
    });
  };
  const [users, setUsers] = useState([
    {
      id: 1,
      username: "김사과",
      email: "apple@apple.com",
      active: false,
    },

    {
      id: 2,
      username: "오렌지",
      email: "orange@orange.com",
      active: false,
    },

    {
      id: 3,
      username: "반하나",
      email: "banana@banana.com",
      active: false,
    },

    {
      id: 4,
      username: "이메론",
      email: "melon@melon.com",
      active: false,
    },

    {
      id: 5,
      username: "배애리",
      email: "berry@berry.com",
      active: false,
    },
  ]);

  const nextId = useRef(6);
  const onCreate = () => {
    const user = {
      id: nextId.current,
      username,
      email,
    };

    //배열에 새 항목을 추가할 때는 spread 연산자 또는 concat 함수 이용
    //setUsers([...users,user])
    setUsers(users.concat(user));

    setInputs({
      username: "",
      email: "",
    });
    nextId.current += 1;
  };

  const onRemove = (id) => {
    // user.id 가 파라미터로 일치하지 않는 원소만 추출해서 새로운 배열을 만듬
    // = user.id 가 id 인 것을 제거함
    setUsers(users.filter((user) => user.id !== id));
  };
  const onToggle = (id) => {
    setUsers(
      users.map((user) =>
        user.id === id ? { ...user, active: !user.active } : user
      )
    );
  };
  const count = useMemo(() => countActiveUsers(users), [users]);
  return (
    <>
      <CreateUser
        username={username}
        email={email}
        onChange={onChange}
        onCreate={onCreate}
      />
      <UserList users={users} onRemove={onRemove} onToggle={onToggle} />
      <div>활성사용자 수 : {count}</div>
    </>
  );
}

export default App;
