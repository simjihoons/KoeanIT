package ch1;

public class Student {
	
	
	// 멤버 변수
	// public int studentID;
	public String studentName;
	public String address;

	// 메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	//의미없음
	public String getStudentName() {
		return studentName;
	}

	// 메서드란
	// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	// 멤버 함수라고도 함
	// 메서드를 구현함으로써 객체의 기능이 구현됨

	// 1. 시험을 친다.
	public void takeTest() {
		System.out.println(studentName+" 학생이 시험을 친다.");
	}

	// 2. 청소를 한다.
	public void cleanUp() {
		System.out.println(studentName+" 학생이 청소를 한다.");
	}
}
