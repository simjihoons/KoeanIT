"use strict";

// 2. Variable , rw(read/write)
// let (added in ES6)
//Mutable
{
  let name = "ellie";
  console.log(name);
  name = "hello";
  console.log(name);
}

// var (쓰면 안됨)
// var는 선언 하기도 전에 값을 넣을수도 있다.
// 이런것을 var hoisting 이라 한다.
// hoisting이란  어디에 선언했는지에 상관없이 젤위로 끌어올려주는것
// var는 block scope이 없다.

//그래서 let이 나오게 됨

//3. constant , read
//할당 한 뒤로는 값을 변경할 수 없음
// Immutable

// 4. Variable type
//primitive type, single item => 더이상 작은 단위로 나눠질 수 없는 한가지의 아이템
//               => number,string , boolean , null , undefiednm, symbol
//object = >싱글아이템들을 여러개 묶어서 한 단위, 한 박스로 관리
//function , first-class-function

const count = 17; //integer
const size = 17.1; // decimal number;
console.log(`value : ${count}, type : ${typeof count}`);
console.log(`value : ${size}, type : ${typeof size}`);

//number - speicla numeric values : infinity , -infinity , NaN(not a number)
const infinity = 1 / 0;
const negativeInfinity = -1 / 0; // -infinity
const nAn = "not a number" / 2;
console.log(infinity);
console.log(negativeInfinity);
console.log(nAn);

//string
const char = "c";
const brendan = "brendan";
const greeting = "hello" + brendan;
console.log(`value : ${greeting}, type : ${typeof greeting}`);
const helloBob = `hi ${brendan}!`; //template literals(string)
console.log(`value : ${helloBob}, type : ${typeof helloBob}`);

//boolean
// false : 0,null,undefined,NaN,''
// true : any other value
const canRead = true;
const test = 3 < 1; // false
console.log(`value : ${canRead} , type : ${typeof canRead}`);
console.log(`value : ${test} , type : ${typeof test}`);

// nul
let nothing = null;
console.log(`value : ${nothing} , type : ${typeof nothing}`);

// undefined
let x = undefined; // let x
console.log(`value : ${x} , type : ${typeof x}`);

//sybol , create unique identifiers for objects
//심볼은 나중에 map 이나 다른 자료구조에서 교유한 식별자가 필요하거나 아니면 동시에 다발적으로 concurrent하게 일어날수 있는 코드에서 우선선위를 주고싶을때 .. 정말 고유한 식별자를 주고싶을떄 사용
const symbol1 = Symbol("id");
const symbol2 = Symbol("id");
console.log(symbol1 === symbol2);
console.log(`value : ${symbol1.description} , type : ${typeof symbol1}`); //출력할때는 .description을 붙여야함

//동일한 심볼 만들기
const gSymbol1 = Symbol.for("id");
const gSymbol2 = Symbol.for("id");
console.log(gSymbol1 === gSymbol2);

//object , real-life object , data structure
const ellie = { name: "ellie", age: 20 };
ellie.age = 21;

//5. Dynamic typing : dynamically typed language
//선언할때 타입을 선언하지 않아도 할당된 값에 따라 타입이 정해짐
let text = "hello";
console.log(`value : ${text} , type : ${typeof text}`);
text = 1;
console.log(`value : ${text} , type : ${typeof text}`);

text = "7" + 5; // 문자열 + 정수 = 문자열
console.log(`value : ${text} , type : ${typeof text}`);

text = "8" / 2; // 문자열 / 정수 = 정수
console.log(`value : ${text} , type : ${typeof text}`);

//이런 문제들 때메 TypeScript가 나오게됨
