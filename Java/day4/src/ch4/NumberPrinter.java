package ch4;

public class NumberPrinter {
	// ��ȣǥdd

	private int id; // �ĺ���
	private static  int waitNumber = 1; // ����ȣ

	// ������
	public NumberPrinter(int id) {
		this.id = id;
	}

	// ��ȣǥ ����ּ���
	public void printWaitNumber() {
		System.out.println(id + " ����� ������ : " + waitNumber);
		this.waitNumber++;
	}

}
