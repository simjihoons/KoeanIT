package ch_4_breakandcontinue;

import java.util.Scanner;

public class continueMainTest {

	public static void main(String[] args) {
		// 예약어 continue
		// 무시하고 진행하는 continue

		// 스캐너 이용해서 MAX,MULTIPLE값 받아서 프로그램 완성
		Scanner sc = new Scanner(System.in);

		System.out.print("Max 값 설정 : ");
		final int MAX = sc.nextInt();

		System.out.print("배수 값 설정 : ");
		final int MULTIPLE = sc.nextInt();

		int num = 0;
		int count = 0;

		for (num = 1; num < MAX; num++) {
			// 3의 배수면 출력 x
			if (num % MULTIPLE == 0) {
				count++;
				continue;
			} // end of if
				// System.out.println("출력 값 : " + num);
		} // end of for
		System.out.println(MULTIPLE + "의 배수 갯수 : " + count);
		sc.close();
	}// end of main

}
