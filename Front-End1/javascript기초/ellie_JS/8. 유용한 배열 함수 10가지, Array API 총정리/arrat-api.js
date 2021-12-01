"use strict";

// Q1. make a string out of an array
// 배열 -> 문자열로 변환
{
  // join : 배열의 값을 string 으로 변환
  const fruits = ["apple", "banana", "orange"];
  const result = fruits.join(":"); //join() 에 ":"을 넣어주면 구분자가 : 로 된다.
  console.log(result);
}

// Q2. make an array out of a string
// 문자열 -> 배열로 변환
{
  console.clear();
  // split : 문자열을 배열로 만들때 사용할 수도 있음
  const fruits = "🍎,🥝,🍌,🍒";
  const result = fruits.split(",");
  console.log(result);
}

// Q3. make this array look like this : [5,4,3,2,1]
{
  console.clear();
  // .reverse 는 array 자체를 반대로 변환시킨다.
  const array = [1, 2, 3, 4, 5];
  const result = array.reverse();
  console.log(result);
  console.log(array);
}

// Q4. make new array without the first two elements
// 주어진 배열에서 1,2 값을 제외한 3개만 있는 새로운 배열 만들기
{
  console.clear();
  const array = [1, 2, 3, 4, 5];
  const result = array.splice(0, 2);
  console.log(result); //splice는 삭제된 값을 출력 , array자체를 바꾸는게 아니라 새로운 배열을 만드는 것이기 때문에 사용할 수 없음
  console.log(array);

  //해결법
  const array2 = [1, 2, 3, 4, 5];
  const result2 = array2.slice(2, 5); // index 2~5번째 만 출력
  console.log(result2);
  console.log(array2);
}

console.clear();
// 앞으로의 퀴즈는 Student class 이용
class Student {
  constructor(name, age, enrolled, score) {
    this.name = name;
    this.age = age;
    this.enrolled = enrolled;
    this.score = score;
  }
}

const students = [
  new Student("A", 29, true, 45),
  new Student("B", 28, false, 80),
  new Student("C", 30, true, 90),
  new Student("D", 40, false, 66),
  new Student("E", 18, true, 88),
];

// Q5. find a student with the score 90
{
  // find는 callback 함수는 만들어서 전달해야함
  const result = students.find((student) => {
    // console.log(student, index);
    return student.score === 90;
  });

  //위의 코드는 한줄로 줄일 수 있음
  const result2 = students.find((student) => student.score === 90);
  console.log(result2);
}

// Q6. make an array of enrolled students
// 원하는 값만 가져오기
// 학생들 중에 enrolled 이 true인 학생들로 배열 생성
{
  const result = students.filter((student) => student.enrolled);
  console.log(result);
}

// Q7. make an array contatining only the students scores
// result should be : [45,80,90,66,88]
// 배열안에 들어있는 요소 한가지한가지를 다른것으로 변환해줌
//
{
  const result = students.map((student) => student.score);
  console.log(result);
}

// Q8. check if there is a student with the score lower than 50
// 50점 보다 낮은 점수가 있는지 (하나라도 있으면 true가 리턴)
{
  console.clear();
  const result = students.some((student) => student.score < 50);
  console.log(result);

  // every : 배열에 들어있는 모든 요소들이 조건을 충족해야 true가 리턴
  const result2 = students.every((student) => student.score < 50);
  console.log(result2);
}

// Q9. compute students' average score
// reduce : 원하는 시작시점 부터 모든 배열을 돌면서 어떤 값을 누적할 때 사용
// reduce.Right : 배열의 마지막부터 시작함
{
  console.clear();
  const result = students.reduce((prev, curr) => {
    console.log("--------");
    console.log(prev);
    console.log(curr);

    return prev + curr.score;
  }, 0);

  //위의 코드 간단하게
  const result2 = students.reduce((prev, curr) => prev + curr.score, 0);
  console.log(result2 / students.length);
}

// Q10. make a string containing all the scores
// result should be : '45,80,90,66,88'
{
  console.clear();
  const result = students
    .map((student) => student.score)
    //점수가 50점 이하는 제외
    .filter((score) => score >= 50)
    .join();
  console.log(result);
}

// Bonus! do Q10 sorted in ascending order
// result should be : '45,66,80,88,90'
{
  const result = students
    .map((student) => student.score)
    .sort((a, b) => a - b)
    //점수가 높은것이 먼저 나오게 할떄
    // .sort((b, a) => b - a)
    .join();
  console.log(result);
}
