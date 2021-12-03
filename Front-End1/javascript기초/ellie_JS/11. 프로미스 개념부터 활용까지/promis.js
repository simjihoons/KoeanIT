"use strict";
// Promise
// 자바스크립트에서 제동하는 비동기를 간편하게 처리할 수 있게 도와주는 오브젝트
// 정해진 장해진 장시간의 기능을 수행하고 나서 정상적으로 수행되었다면 성공메세지와 결과값이 나옴

// Promise is a JavaScript object for asynchronous operation
// State : pending -> fulfilled or rejected
// Producer vs Consumer

// 1. Producer
// when new Promise created, the executor runs automatically.
const promise = new Promise((resovle, reject) => {
  // doing some heavy work (network,read files)
  console.log("doing something...");
  setTimeout(() => {
    resovle("ellie");
    //reject(new Error("no network"));
  }, 2000);
});

// 2. Consumers : then , catch , finally
// then : promise가 정상적으로 잘 수행이 되어서 마지막에 최종적으로 resovle라는 콜백 함수를 통해서
//        전달한 값이 value 의 파라미터로 전달됨
promise
  .then((value) => {
    console.log(value);
  })
  //실패했을때
  .catch((error) => {
    console.log(error);
  })
  //성공과 실패와 상관없이 무조건 마지막에 호출됨
  .finally(() => {
    console.log("finally");
  });

// 3. Promis chaining
const fetchNumber = new Promise((resovle, reject) => {
  setTimeout(() => resovle(1), 1000);
});

fetchNumber
  .then((num) => num * 2)
  .then((num) => num * 3)
  .then((num) => {
    return new Promise((resovle, reject) => {
      setTimeout(() => resovle(num - 1), 1000);
    });
  })
  .then((num) => console.log(num));

// 4. Error Handling
const getHen = () =>
  new Promise((resovle, reject) => {
    setTimeout(() => resovle(`${"🐓"}`), 1000);
  });

const getEgg = (hen) =>
  new Promise((resovle, reject) => {
    //setTimeout(() => resovle(`${hen}=>🥚`), 1000);
    setTimeout(() => reject(new Error(`${hen}=>🥚`)), 1000);
  });

const cook = (egg) =>
  new Promise((resovle, reject) => {
    setTimeout(() => resovle(`${egg}=>🍳`), 1000);
  });

getHen()
  .then((hen) => getEgg(hen))
  .catch((error) => {
    return "🥖";
  })
  .then((egg) => cook(egg))
  .then((meal) => console.log(meal))
  .catch(console.log);

// 이렇게 줄일수 있음
// getHen()
// .then(getEgg)
// .then(cook)
// .then(console.log);

// 5.
