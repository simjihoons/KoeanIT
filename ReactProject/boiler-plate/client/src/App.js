import "./App.css";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import LandingPage from "./components/views/LandingPage/LandingPage";
import LoginPage from "./components/views/LoginPage/LoginPage";
import RegisterPage from "./components/views/RegisterPage/RegisterPage";
import Auth from "./hoc/auth";
function App() {
  //option
  //null - 아무나 출입 가능한 페이지
  //true - 로그인한 유저만 출입이 가능한 페이지
  //false - 로그인한 유저는 출입 불가 페이지
  return (
    <>
      <Router>
        <div>
          <Switch>
            {/* Auth(페이지,로그인에관한페이지,관리자페이지:true이면 관리자만들어갈수있는페이지) */}
            <Route exact path="/" component={Auth(LandingPage, null)} />
            <Route exact path="/login" component={Auth(LoginPage, false)} />
            <Route
              exact
              path="/register"
              component={Auth(RegisterPage, false)}
            />
          </Switch>
        </div>
      </Router>
    </>
  );
}

export default App;
