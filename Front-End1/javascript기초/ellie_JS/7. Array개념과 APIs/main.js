"use strict";

// Array🎉

// 1. Declaration
const arr1 = new Array();
const arr2 = [1, 2];

// 2. Index Position
const fruits = ["🍎", "🍌"];
console.log(fruits);
console.log(fruits.length);
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);
console.log(fruits[fruits.length - 1]);

// 3. Looping over an array
// print all fruits
console.clear();

// 3-1
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

// 3-2
for (let fruit of fruits) {
  console.log(fruit);
}

// 3-3
fruits.forEach((fruit, index) => console.log(fruit, index));

// 4. Addtion , deletion , copy
// pash : add an item to the end
fruits.push("🍓", "🍒");
console.log(fruits);
// pop : remove an item from the end
fruits.pop();
fruits.pop();
console.log(fruits);

// unshift : add an item to the benigging
fruits.unshift("🍋", "🍓");
console.log(fruits);

// shift : remove an item from the benigging
fruits.shift();
fruits.shift();
console.log(fruits);

// note !! shift , unshift are slower than pop, push
// splice : remove an item by index position
console.clear();
fruits.push("🍉", "🍈", "🍊");
console.log(fruits);

fruits.splice(1, 1);
console.log(fruits);

fruits.splice(1, 1, "🍑", "🍍");
console.log(fruits);

// combine two arrays
const fruits2 = ["🍕", "🍔"];
const newFruits = fruits.concat(fruits2);
console.log(newFruits);

// 5. Searching
// find the index
console.clear();
console.log(fruits);
console.log(fruits.indexOf("🍎"));
console.log(fruits.indexOf("🍑"));

// 해당 값이 없을때는 -1 출력
console.log(fruits.indexOf("🌭"));

// includes
// 값이 있는지 없는지 검사해줌
console.log(fruits.includes("🍿"));
console.log(fruits.includes("🍑"));

// lastIndexOf
console.clear();
fruits.push("🍎");
console.log(fruits);

// indexOf : 첫번째로 만나는 index 출력
// lastIndexOf : 마지막으로 만나는 index 출력
console.log(fruits.indexOf("🍎"));
console.log(fruits.lastIndexOf("🍎"));
