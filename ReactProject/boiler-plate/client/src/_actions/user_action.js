import axios from "axios";
import { LOGIN_USER, REGISTER_USER, AUTH_USER } from "./types";

export function loginUser(dataToSubmit) {
  const requset = axios
    .post("/api/users/login", dataToSubmit)
    .then((response) => response.data);

  return {
    //리턴을 시켜서 reducer로 보냄
    type: LOGIN_USER,
    payload: requset,
  };
}

export function registerUser(dataToSubmit) {
  const requset = axios
    .post("/api/users/register", dataToSubmit)
    .then((response) => response.data);

  return {
    //리턴을 시켜서 reducer로 보냄
    type: REGISTER_USER,
    payload: requset,
  };
}

export function auth() {
  const request = axios
    .get("/api/users/auth")
    .then((response) => response.data);

  return {
    type: AUTH_USER,
    payload: request,
  };
}
