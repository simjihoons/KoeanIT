import { combineReducers } from "redux";
import user from "./user_reducer";

//combineReducers => 여러 리듀서를 하나(rootReducer)로 합쳐줌
const rootReducer = combineReducers({
  user,
});

export default rootReducer;
