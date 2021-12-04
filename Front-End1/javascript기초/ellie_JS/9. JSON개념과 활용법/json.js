// JSON

//JavaScript Object Notation

// 1. Object to JSON
// stringfy(obj) => obj -> JSON

let json = JSON.stringify(true);
console.log(json);

json = JSON.stringify(["apple", "banana"]);
console.log(json);

// 오브젝트 json으로 변환
// 함수는 포함되지 않음
const rabbit = {
  name: "tori",
  color: "white",
  size: null,
  birthDate: new Date(),
  jump: () => {
    console.log(`${name} can jump~!`);
  },
};

json = JSON.stringify(rabbit);
console.log(json);

json = JSON.stringify(rabbit, ["name"]);
console.log(json);

json = JSON.stringify(rabbit, (key, value) => {
  console.log(`k : ${key} , v : ${value}`);
  return key === "name" ? "ellie" : value;
});
console.log(json);

// 2. JSON to Object
//parse(json)
console.clear();
json = JSON.stringify(rabbit);

const obj = JSON.parse(json, (key, value) => {
  console.log(`k : ${key} , v : ${value}`);
  return key === "birthDate" ? new Date(value) : value;
});
console.log(obj);
rabbit.jump();

console.log(rabbit.birthDate.getDate());
console.log(rabbit.birthDate);
console.log(obj.birthDate.getDate());
