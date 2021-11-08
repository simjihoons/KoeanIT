package ch5;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {
	static final int LOTTO_NUM_SIZE = 6;

	// 로또 번호 생성하는 기능(6자리)

	public int[] getLottoNumber() {
		// 번호를 담을 공간
		int[] numbers = new int[LOTTO_NUM_SIZE];

		Random ran = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(45) + 1; // 1~45까지

			// 3 3 1 2 3 5
			// 위와 같이 반복적인것을 처리하기 위함
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i -= 1;
					break;
				}
			}

		}

		// 배열 정렬
		Arrays.sort(numbers);

		return numbers;

	}

	// 테스트 코드
//	public static void main(String[] args) {
//		LottoNumber lottoNumber = new LottoNumber();
//		int[] nums = lottoNumber.getLottoNumber();
//
//		for (int i : nums) {
//			System.out.print(i + "\t");
//		}
	
}
