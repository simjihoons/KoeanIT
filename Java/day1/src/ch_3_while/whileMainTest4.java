package ch_3_while;

import java.util.Scanner;

public class whileMainTest4 {

	public static void main(String[] args) {
		// do-while
		// ��ĳ�� ���
		// ������� �Է� ���� �޾Ƽ� ��������
		// ���� ��� ���

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �Է� : ");
//		int num = sc.nextInt();
//		int num2 = num;
//		int sum = 0;
//		
//		do {
//			sum += num;
//			num--;
//		}while(num != 0);
//		
//		System.out.println("1���� "+num2+"������ �� ���� : "+sum+"�Դϴ�.");
//	

		// ����ڰ� 0�� �Է��ϸ� ���α׷��� ����
		// ����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ����
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;

		do {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			sum += num;
		} while (num != 0);

		System.out.println("������ �� ���� : " + sum + "�Դϴ�.");

		sc.close();
	}// end of main

}
