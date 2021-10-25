package ch1;

public class Student {
	int studentId;
	String studentName;

	// ������ class�� ����Ÿ������ ���
	Subject korea;
	Subject math;

	// �л� Ŭ���� ������
	public Student(int id, String name) {
		studentId = id;
		studentName = name;

		// ���� Ÿ���� ������ �ؾ� ��� �� ���ִ�.
		// �޸𸮿� �����ϰ� ������ �Ѵ�.
		korea = new Subject();
		math = new Subject();
	}

	// ���� �Է� �޴� �޼��� ����(����)
	public void setKoreaSubject(String name, int score) {
		korea.subjecName = name;
		korea.score = score;
	}

	// ���� �Է� �޴� �޼��� ����(����)
	public void setMathSubject(String name, int score) {
		math.subjecName = name;
		math.score = score;
	}

	// �л��� ������ ���
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " �л��� �� ������ : " + total + "�� �Դϴ�.");
	}

	public void showStudentAvg() {
		double avg = (korea.score + math.score) / 2;
		System.out.println(studentName + " �л��� �� ������ : " + avg + "�� �Դϴ�.");
	}

}
