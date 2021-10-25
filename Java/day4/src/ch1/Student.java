package ch1;

public class Student {
	int studentId;
	String studentName;

	// 설계한 class를 참조타입으로 사용
	Subject korea;
	Subject math;

	// 학생 클래스 생성자
	public Student(int id, String name) {
		studentId = id;
		studentName = name;

		// 참조 타입은 생성을 해야 사용 할 수있다.
		// 메모리에 존재하게 만들어야 한다.
		korea = new Subject();
		math = new Subject();
	}

	// 정보 입력 받는 메서드 생성(국어)
	public void setKoreaSubject(String name, int score) {
		korea.subjecName = name;
		korea.score = score;
	}

	// 정보 입력 받는 메서드 생성(수학)
	public void setMathSubject(String name, int score) {
		math.subjecName = name;
		math.score = score;
	}

	// 학생의 총점을 출력
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총 점수는 : " + total + "점 입니다.");
	}

	public void showStudentAvg() {
		double avg = (korea.score + math.score) / 2;
		System.out.println(studentName + " 학생의 총 점수는 : " + avg + "점 입니다.");
	}

}
