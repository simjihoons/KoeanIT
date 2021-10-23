package ch2;

public class StudentMainTest {

	// 메인 함수(코드의 시작점)
	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동",4);
		
		//System.out.println(s1.number);
		//System.out.println(s1.name);
		//System.out.println(s1.grade);
		//의미없음
		s1.showInfo();

		System.out.println("-----------------------");
		
		//기본생성자로 객체 생성
		Student s2 = new Student();
		s2.name = "이순신";
		s2.number = 2;
		s2.grade = 5;

		s2.showInfo();

		
		
		
		
		
	}// end of main

}// end of class
