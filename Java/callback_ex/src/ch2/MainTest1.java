package ch2;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		MainActivityEX1 mainActivityEX1 = new MainActivityEX1();
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		new SubActivityEx1(mainActivityEX1,num1,num2);
	}

}
