package ch_1_If;

import java.util.Scanner;

class IfMainTest2 {

	public static void main(String[] args) {
		// 점수 입력 받아서 학점 출력하기
		// 단, 100점이 넘거나 0점보다 작으면 오류 출력
		
		Scanner scanner = new Scanner(System.in);
		char result = 'Z';

		System.out.println("성적을 입력해 주세요");
		int point = scanner.nextInt();

		if (point > 100 || point < 0) {
			System.out.println("0~100점 까지만 입력해 주세요");
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
		System.out.println("당신의 학점은 :" + result + "입니다.");

	}

}