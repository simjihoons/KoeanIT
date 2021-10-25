package ch4;

public class NumberPrinter {
	// 번호표

	private int id; // 식별자
	private static  int waitNumber = 1; // 대기번호

	// 생성자
	public NumberPrinter(int id) {
		this.id = id;
	}

	// 번호표 찍어주세요
	public void printWaitNumber() {
		System.out.println(id + " 기기의 대기순번 : " + waitNumber);
		this.waitNumber++;
	}

}
