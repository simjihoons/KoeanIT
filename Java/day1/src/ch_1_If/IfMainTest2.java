package ch_1_If;

import java.util.Scanner;

class IfMainTest2 {

	public static void main(String[] args) {
		// ���� �Է� �޾Ƽ� ���� ����ϱ�
		// ��, 100���� �Ѱų� 0������ ������ ���� ���
		
		Scanner scanner = new Scanner(System.in);
		char result = 'Z';

		System.out.println("������ �Է��� �ּ���");
		int point = scanner.nextInt();

		if (point > 100 || point < 0) {
			System.out.println("0~100�� ������ �Է��� �ּ���");
		} else if (point >= 90) {
			result = 'A';
		} else if (point >= 80) {
			result = 'B';
		} else if (point >= 70) {
			result = 'C';
		} else if (point >= 60) {
			result = 'D';
		} else {
			result = 'F';
		}
		System.out.println("����� ������ :" + result + "�Դϴ�.");

	}

}