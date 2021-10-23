package ch_3_while;

import java.util.Scanner;

public class whileMainTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("어디까지 더할까요 : ");
		final int LIMIT_VALUE = sc.nextInt();

		int num = 1;
		int sum = 0;

		if (LIMIT_VALUE < 0 || LIMIT_VALUE < 1)
			System.out.println("1 이상을 입력해주세요");
		else {
			while (num <= LIMIT_VALUE) {
				sum += num;
				num++;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
