package ch1;

public class ArrayMainTest {

	public static void main(String[] args) {

		// 배열이란
		// 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를
		// 하나의 변수에 저장하기 위한 것이라고 할 수 있다.

		// 배열 선언 방법
		int[] arr1 = new int[3]; // 권장
		int arr2[] = new int[10];

		// 초기화(값을 넣는 방법)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;

		// 배열 선언과 동시에 초기화
		int[] numbers1 = new int[] { 10, 20, 30 };
		int[] numbers2 = { 10, 20, 30 }; // 권장

		// 출력
//		System.out.println(numbers1[0]);
//		System.out.println(numbers1[1]);
//		System.out.println(numbers1[2]);

		// 문자열 배열
		String[] strArr = new String[10];
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";

//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
//		System.out.println(strArr[3]);
//		System.out.println(strArr[4]);
//		
//		System.out.println(strArr.length); 
//		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}
		
		// 모든 프로그래밍 언어에서는 index는 0부터 사용
		// 배열을 사용할 때 보통 for문과 관계해서 많이 사용
		// new int[22]; // 길이 : 22 인덱스:21
		// new int[74]; // 길이 : 74 인덱스:73
		
		
		

	}// EOM

}// EOC
