package ch1;

public class ThreadTest1 {

	// 메인함수 <-- 메인 쓰레드
	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.print("-");

			try {
				// 0.5초 딜레이를 준다.
				Thread.sleep(500); // 1/1000 초 1000 => 1초 500 =>0.5초
			} catch (Exception e) {
				System.out.println(e);
			}
		}//end of for

	}// EOM

}// EOC
