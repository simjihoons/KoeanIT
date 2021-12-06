"use strict";

// async & await
// clear style of using promise :)

// 1. async

/* async 쓰기 전

function fetchUser() {
  return new Promise((resovle, reject) => {
    // do network request in 10 secs...
    resovle("ellie");
  });
}
*/

// 앞에 async를 붙이면 자동으로 promise상태가 된다.
async function fetchUser() {
  return "ellie";
}
const user = fetchUser();
user.then(console.log);
console.log(user);

// 2. await
// async가 붙은 함수 안에서만 사용이 가능하다.
//
function delay(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

async function getApple() {
  await delay(2000);
  return "🍎";
}

async function getBanana() {
  await delay(1000);
  return "🍌";
}

// 기존의 promise chaining 방식
// 콜백지옥과 비슷함....
// function pickFruits() {
//   return getApple().then((apple) => {
//     return getBanana().then((banana) => `${apple} + ${banana}`);
//   });
// }

// pickFruits().then(console.log);

//위 의 예제 async 사용
// 병렬 처리를 하도록 코드 작성함
async function pickFruits() {
  const applePromise = getApple();
  const bananaPromise = getBanana();
  const apple = await applePromise;
  const banana = await bananaPromise;

  return `${apple} + ${banana}`;
}

pickFruits().then(console.log);

// 3. useful Promise APIs
// Promise 배열을 전달하게 되면 모든 Promise들이 병렬적으로 다 받을때 까지 모아줌
function pickAllFruits() {
  return Promise.all([getApple(), getBanana()]).then((fruits) =>
    fruits.join("+")
  );
}

pickFruits().then(console.log);

// race : 배열에 전달된 Promise 중에서 가장 먼저 값을 리턴하는 값만 전달되어짐
function pickOnlyone() {
  return Promise.race([getApple(), getBanana()]);
}

pickOnlyone().then(console.log);
