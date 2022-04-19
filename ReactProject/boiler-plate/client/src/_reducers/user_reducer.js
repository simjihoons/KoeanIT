/* eslint-disable import/no-anonymous-default-export */

//유저 리듀서
import { LOGIN_USER, REGISTER_USER } from "../_actions/types";

export default function (state = {}, action) {
  switch (action.type) {
    case LOGIN_USER:
      return { ...state, loginSuccess: action.payload };

    case REGISTER_USER:
      return { ...state, registerUser: action.payload };

    default:
      return state;
  }
}
