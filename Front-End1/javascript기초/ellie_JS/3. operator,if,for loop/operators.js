// 1. String concatenation
console.log("my" + "cat");
console.log("1" + 2);
console.log(`string literals : 1+2 = ${1 + 2}`);

// 2. Numeric operators
// +-*/ etc...

// 3. Increment and decrement operators
// ++ , --

// 4. Assignment operators
// += -= etc...

// 5. Comparision operators
// > < >= <= etc...

// 6. Logical operators : ||(or) , &&(and) , !(not)
// ||(or) , finds the first truthy value
// &&(and) , finds the first falsy value

// 7. Equality
// == === != !==
// == loose equality, with type conversion
// === strict equality , no type conversion

// object equality by reference
// object는 메모리에 reference형태로 저장됨
const ellie1 = { name: "ellie" };
const ellie2 = { name: "ellie" };
const ellie3 = ellie1;
console.log(ellie1 == ellie2);
console.log(ellie1 === ellie2);
console.log(ellie1 == ellie3);

//===========================================================

// 8. Conditional operators : if
// if , else if ,else

// 9. Ternary operator
// condition ? value1 : value2

// 10. Switch statement

// 11. Loops
// while loop , while the condition it truthy,
// body code is executed.
let i = 3;
while (i > 0) {
  console.log(`while : ${i}`);
  i--;
}

// do while loop , body code is executed first,
// then check the condition
do {
  console.log(`do while : ${i}`);
  i--;
} while (i > 0);

// for loop , for(begin; condition; step)
for (i = 3; i > 0; i--) {
  console.log(`for : ${i}`);
}

for (let i = 3; i > 0; i = i - 2) {
  // inline variable declaration.
  console.log(`inline variable for : ${i}`);
}

// break,continue
// Q1. iterate form 0 to 10 and print only even numbers (use continue)
for (let i = 0; i < 10; i++) {
  if (i % 2 !== 0) continue;
  console.log(`Q1 value : ${i}`);
}
// Q2. iterate from 0 to 10 and print number until reaching 8 (use break)
for (let i = 0; i < 10; i++) {
  if (i === 8) break;
  console.log(`Q2 value : ${i}`);
}
