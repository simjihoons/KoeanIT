"use strict";

// 동기 비동기 차이
// JavaScript is synchronous
// Excute the code block bt orger after hoisting
// hoisting 이 된 이후 부터 코드가 우리가 작성한 순서에 맞춰서 하나씩 동기적으로 실행
// hoistion => var, function declaration 들이 자동적으로 제일 위로 선언으로 올라가는것
console.log("1");

//비동기식
setTimeout(() => console.log("2"), 1000);

console.log("3");

// Synchronous callback
function printImmediately(print) {
  print();
}
printImmediately(() => console.log("hello"));

// Asynchronous callback
function printWithDelay(print, timeout) {
  setTimeout(print, timeout);
}

printWithDelay(() => console.log("asyncCallBack"), 2000);

// CallBack Hell
// 문제점 : 가독성이 떨어짐
console.clear();
class UserStorage {
  loginUser(id, password, onSuccess, onError) {
    setTimeout(() => {
      if (
        (id === "ellie" && password === "dream") ||
        (id == "coder" && password === "academy")
      ) {
        onSuccess(id);
      } else {
        onError(new Error("not found"));
      }
    }, 2000);
  }

  getRoles(user, onSuccess, onError) {
    setTimeout(() => {
      if (user === "ellie") {
        onSuccess({ name: "ellie", role: "admin" });
      } else {
        onError(new Error("no access"));
      }
    }, 1000);
  }
}

const userStorage = new UserStorage();
const id = prompt("enter your id");
const pw = prompt("enter your password");
userStorage.loginUser(
  id,
  pw,
  (user) => {
    userStorage.getRoles(
      user,
      (userWithRole) => {
        alert(
          `Hello! ${userWithRole.name}, you have a ${userWithRole.role} role`
        );
      },
      (error) => {
        console.log("error");
      }
    );
  },
  (error) => {
    console.log("error");
  }
);
