package ch1;



public class ExceptionEx1 {

	public static void main(String[] args) {
		// 예외 발생 시켜 보기
		int[] arr = { 1, 2, 3, 4, 5 };

//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		try {
			// 예외가 발생할 코드
			// 문법적으로 잘못된 코드 = 컴파일 오류
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
		} 

		System.out.println("비정상 종료되지 않았습니다.");
		
		// 프로그래밍이 종료되지 않고 계속 실행 되어 진다.
	}

}
