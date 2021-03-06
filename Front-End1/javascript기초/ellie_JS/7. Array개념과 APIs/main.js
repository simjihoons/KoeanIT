"use strict";

// Arrayπ

// 1. Declaration
const arr1 = new Array();
const arr2 = [1, 2];

// 2. Index Position
const fruits = ["π", "π"];
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
fruits.push("π", "π");
console.log(fruits);
// pop : remove an item from the end
fruits.pop();
fruits.pop();
console.log(fruits);

// unshift : add an item to the benigging
fruits.unshift("π", "π");
console.log(fruits);

// shift : remove an item from the benigging
fruits.shift();
fruits.shift();
console.log(fruits);

// note !! shift , unshift are slower than pop, push
// splice : remove an item by index position
console.clear();
fruits.push("π", "π", "π");
console.log(fruits);

fruits.splice(1, 1);
console.log(fruits);

fruits.splice(1, 1, "π", "π");
console.log(fruits);

// combine two arrays
const fruits2 = ["π", "π"];
const newFruits = fruits.concat(fruits2);
console.log(newFruits);

// 5. Searching
// find the index
console.clear();
console.log(fruits);
console.log(fruits.indexOf("π"));
console.log(fruits.indexOf("π"));

// ν΄λΉ κ°μ΄ μμλλ -1 μΆλ ₯
console.log(fruits.indexOf("π­"));

// includes
// κ°μ΄ μλμ§ μλμ§ κ²μ¬ν΄μ€
console.log(fruits.includes("πΏ"));
console.log(fruits.includes("π"));

// lastIndexOf
console.clear();
fruits.push("π");
console.log(fruits);

// indexOf : μ²«λ²μ§Έλ‘ λ§λλ index μΆλ ₯
// lastIndexOf : λ§μ§λ§μΌλ‘ λ§λλ index μΆλ ₯
console.log(fruits.indexOf("π"));
console.log(fruits.lastIndexOf("π"));
