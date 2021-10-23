package ch1;

import java.util.*;

public class StudentMainTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "인천";

		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
		//의미없음
		System.out.println("--------------");

		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "부산";

		studentKim.showStudentInfo();
		studentKim.takeTest();
		studentKim.cleanUp();

		System.out.println("--------------");

		String lName = studentLee.getStudentName();
		System.out.println("name1 : " + lName);

		String kName = studentKim.getStudentName();
		System.out.println("name2 : " + kName);

		System.out.println("--------------");

		Scanner sc = new Scanner(System.in);
		Student studentPark = new Student();
		
		System.out.print("이름 입력 : ");
		studentPark.studentName = sc.next();
		
		System.out.print("주소 입력 : ");
		studentPark.address = sc.next();
		
		studentPark.showStudentInfo();

		sc.close();

	}

}
