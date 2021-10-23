package ch2;

public class Student {
	// 생성자
	// constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들라고 지시하는것(강제성 부여됨)

	int number;
	String name;
	int grade;

	// 기본 생성자
	// 사용자 정의 생성자가 없는 경우에는
	// 컴파일러가 자동으로 기본생성자를 만들어 준다.
	public Student() {// 기본생성자
	}

	// 생성자 만들기(개발자가 직접 정의 - 사용자 정의 생성자)
	public Student(int num, String name, int grade) {
		number = num;
		// 매개변수 이름과 멤버변수 이름이 같을때 this를 사용한다.
		// this는 멤버변수를 가리킨다.
		this.name = name;
		this.grade = grade;

	}
	//의미없음
	// 메서드 정의
	public void showInfo() {
		System.out.println(name + " 학생의 학번은 " + number + " 입니다.\n" + name + " 학생의 학년은 " + grade + "학년 입니다.");
	}
}
