package ch_4_breakandcontinue;

import java.util.Scanner;

public class continueMainTest {

	public static void main(String[] args) {
		// ����� continue
		// �����ϰ� �����ϴ� continue

		// ��ĳ�� �̿��ؼ� MAX,MULTIPLE�� �޾Ƽ� ���α׷� �ϼ�
		Scanner sc = new Scanner(System.in);

		System.out.print("Max �� ���� : ");
		final int MAX = sc.nextInt();

		System.out.print("��� �� ���� : ");
		final int MULTIPLE = sc.nextInt();

		int num = 0;
		int count = 0;

		for (num = 1; num < MAX; num++) {
			// 3�� ����� ��� x
			if (num % MULTIPLE == 0) {
				count++;
				continue;
			} // end of if
				// System.out.println("��� �� : " + num);
		} // end of for
		System.out.println(MULTIPLE + "�� ��� ���� : " + count);
		sc.close();
	}// end of main

}
