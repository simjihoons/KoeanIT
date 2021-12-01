"use strict";

// Object
// one of the JavaScript's data types.
// a collection of related data and/or functionality
// Nearly all objects in JavaScript are instances of Object
// object = {key : value};

// const name = 'ellie';
// const age = 4;
// print(name,age);
// function print(name,age) {
//     console.log(name);
//     console.log(age);
// }

// 1. Literals and properties
function print(person) {
  console.log(person.name);
  console.log(person.age);
}

//위의 코드를 개선하고자 Object를 사용
const ellie = { name: "ellie", age: 4 };
print(ellie);

// make Object
const obj1 = {}; // 'object literal' syntax
const obj2 = new Object(); // 'object constructor' syntax

// 가능은 하나 이렇게 계속 동적으로 하면 좋지 않음
// with JavaScript magic (dynamically typed language)
// can add properties later
ellie.hasJob = true;
console.log(ellie.hasJob);

// can delete properties later
delete ellie.hasJob;
console.log(ellie.hasJob);

// 2. Computed properties
// 계산된 properties
// key should be always string type
console.log(ellie.name);
console.log(ellie["name"]);
ellie["hasJob"] = true;
console.log(ellie.hasJob);

// 3. Property value shorthand
const person1 = { name: "bob", age: 12 };
const person2 = { name: "bob2", age: 22 };
const person3 = { name: "bob3", age: 32 };

// 4. Constructor function
// 오브젝트를 하나 더 만들때 동일한 작업을 하지 않게...
const person4 = new Person("ellie", 30);
console.log(person4);
function Person(name, age) {
  this.name = name;
  this.age = age;
}

// 5. in operator : property existence check ( key in obj )
// 해당 하는 오브젝트 안에 키가 있는지 없는지 확인
console.log("name" in ellie);
console.log("age" in ellie);
console.log("random" in ellie);

// 6. for..in vs for..of
// for (key in obj)
console.clear();

// 모든 키를 받아와서 처리하고 싶을때
for (let key in ellie) {
  console.log(key);
}

// for(value of iterable)
// 오브젝트를 쓰는게 아니라 배열,리스트 순차적으로 iterable 한 것들에 씀
const array = [1, 2, 4, 5];

// for of 쓰기 전
// for (let i = 0; i < array.length; i++) {
//   console.log(array[i]);
// }

// for of 사용
for (let value of array) {
  console.log(value);
}

// 7. Fun cloning
// Object.assign(dest,[obj1,obj2,obj3...])
const user = { name: "ellie", age: "20" };
const user2 = user;
user2.name = "coder";
console.log(user); // user.name change coder

// old way
const user3 = {};
for (let key in user) {
  user3[key] = user[key];
}
console.clear();
console.log(user3);

// user Object.assign
const user4 = {};
Object.assign(user4, user);
console.log(user4);

//and
const user5 = Object.assign({}, user);
console.log(user5);

// another example
const fruit1 = { color: "red" };
const fruit2 = { color: "blue", size: "big" };
const mixed = Object.assign({}, fruit1, fruit2);
console.log(mixed.color); // blue
console.log(mixed.size); // big
