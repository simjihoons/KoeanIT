package ch_3_while;

import java.util.Scanner;

public class whileMainTest4 {

	public static void main(String[] args) {
		// do-while
		// 스캐너 사용
		// 사용자의 입력 값을 받아서 덧셈연산
		// 연산 결과 출력

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		int num2 = num;
//		int sum = 0;
//		
//		do {
//			sum += num;
//			num--;
//		}while(num != 0);
//		
//		System.out.println("1부터 "+num2+"까지의 총 합은 : "+sum+"입니다.");
//	

		// 사용자가 0을 입력하면 프로그램을 종료
		// 사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;

		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			sum += num;
		} while (num != 0);

		System.out.println("연산의 총 합은 : " + sum + "입니다.");

		sc.close();
	}// end of main

}
