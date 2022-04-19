/* eslint-disable react-hooks/exhaustive-deps */
/* eslint-disable import/no-anonymous-default-export */
import React, { useEffect } from "react";
import { useDispatch } from "react-redux";
import { auth } from "../_actions/user_action";

export default function (SpecificComponent, option, adminRoute = null) {
  //option
  //null - 아무나 출입 가능한 페이지
  //true - 로그인한 유저만 출입이 가능한 페이지
  //false - 로그인한 유저는 출입 불가 페이지

  function AuthenticationCheck(props) {
    const dispatch = useDispatch();

    useEffect(() => {
      dispatch(auth()).then((response) => {
        console.log(response);

        //로그인 하지 않은 상태
        if (!response.payload.isAuth) {
          if (option) {
            //option이 true일때
            props.history.push("/login");
          }
        } else {
          //로그인 한 상태

          //어드민이 아닌데 어드민만 들어갈수 있는 페이지를 눌렀을때
          if (adminRoute && !response.payload.isAdmin) {
            props.history.push("/");
          } else {
            if (option === false) {
              //로그인한 유저는 들어갈수 없는 페이지
              props.history.push("/");
            }
          }
        }
      });
    }, []);

    return <SpecificComponent />;
  }
  return AuthenticationCheck;
}
