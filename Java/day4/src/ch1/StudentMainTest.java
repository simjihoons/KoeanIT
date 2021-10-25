package ch1;

//클래스 사용하는 입장
public class StudentMainTest {

	// 메인함수(코드의 시작점)
	public static void main(String[] args) {
		Student stdLee = new Student(1, "홍길동");

		stdLee.setKoreaSubject("국어", 100);
		stdLee.setMathSubject("수학", 90);
		stdLee.showStudentScore();
		stdLee.showStudentAvg();

		System.out.println("-----------------------------");

		Student stdKim = new Student(2, "이순신");

		stdKim.setKoreaSubject("국어", 100);
		stdKim.setMathSubject("수학", 100);
		stdKim.showStudentScore();

		System.out.println("-----------------------------");

		Student stdPark = new Student(3, "세종");

		stdPark.setKoreaSubject("국어", 100);
		stdPark.setMathSubject("수학", 0);
		stdPark.showStudentScore();

	}// end of main

}// end of class
