package ch1;

//Ŭ���� ����ϴ� ����
public class StudentMainTest {

	// �����Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		Student stdLee = new Student(1, "ȫ�浿");

		stdLee.setKoreaSubject("����", 100);
		stdLee.setMathSubject("����", 90);
		stdLee.showStudentScore();
		stdLee.showStudentAvg();

		System.out.println("-----------------------------");

		Student stdKim = new Student(2, "�̼���");

		stdKim.setKoreaSubject("����", 100);
		stdKim.setMathSubject("����", 100);
		stdKim.showStudentScore();

		System.out.println("-----------------------------");

		Student stdPark = new Student(3, "����");

		stdPark.setKoreaSubject("����", 100);
		stdPark.setMathSubject("����", 0);
		stdPark.showStudentScore();

	}// end of main

}// end of class
