// import React, { useState } from "react";
// import axios from "axios";
// import useAsync from "react-async";

// function getUsers() {
//   const response = axios.get(
//     "https://https://jsonplaceholder.typicode.com/users"
//   );
//   return response.data;
// }

// function Users() {
//   const [UserId, setUserId] = useState(null);
//   const [state, refetch] = useAsync(getUsers, [], true);
//   const { loading, data: users, error } = state;

//   if (loading) return <div>로딩중...</div>;
//   if (error) return <div>에러발생!!!</div>;
//   if (!users) return <button onClick={refetch}>불러오기</button>;
//   return (
//     <>
//       <ul>
//         {/* {users.map((users
//           <li
//             key={users.id}
//             onClick={() => {
//               setUserId(users.id);
//             }}
//             style={{ cursor: "pointer" }}
//           >
//             {users.username} ({users.name})
//           </li>;
//         ))} */}
//       </ul>
//       <button>다시 불러오기</button>
//     </>
//   );
// }

// export default Users;
