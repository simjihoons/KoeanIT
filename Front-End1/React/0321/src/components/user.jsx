import React from "react";
import axios from "axios";
import useAsync from "../useAsync";

function getUsers(id) {
  //useAsync 요청 상태 관리 로직을 쉽게 재사용하는 방법
  const response = axios.get(
    "https://jsonplaceholder.typicode.com/users/${id}"
  );

  return response.data;
}
function User({ id }) {
  const [state] = useAsync(getUsers(id), [id]);
  const { loading, data: user, error } = state;

  if (loading) return <div>로딩중..</div>;
  if (error) return <div>에러가 발생했습니다</div>;
  if (!user) return null;

  return (
    <>
      <h2>{user.username}</h2>
      <p>
        <b>Email:</b> {user.email}
      </p>
    </>
  );
}

export default User;
