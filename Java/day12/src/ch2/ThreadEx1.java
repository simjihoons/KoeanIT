package ch2;

import java.util.Scanner;

class MyThread1 extends Thread {
	boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			System.out.print("-");

			try {
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("작업자를 생성 하겠습니다.");

		// 메인 스레드 => 작업자를 요청해서 생성
		MyThread1 th1 = new MyThread1();
		// th1.start();

		System.out.println("0번 혹은 2번 입력 시 중지");
		Scanner sc = new Scanner(System.in);
		// int userInput = sc.nextInt();

		// 이경우 만약 1을 누르게 된다면 계속실행이 되고 다시 0을 눌러도 계속 실행이된다.
		// 이를 해결하기 위해 do while문을 사용한다.

//		if (userInput == 0) {
//		//	th1.stop(); // deprecated(더이상 유지 보수 하지 않음 , 나중에 없어질수도 있는 메서드다.)
//			th1.flag = false;
//		}

		// 문제 do - while을 사용
		do {
			// 무조건 실행되는 부분
			// 입력받는게 들어와야할듯?

			int userInput = sc.nextInt();
			if (userInput == 0)
				th1.flag = false;
		} while (th1.flag != false); // 조건은....아마도 플래그가 거짓이 될때까지

//		System.out.println("1. 실행\n2. 정지");
//		do {
//			
//			int userInput = sc.nextInt();
//			if(userInput == 2 || userInput == 0) {
//				th1.flag = false;
//			} else if(userInput == 1) {
//				th1.start();
//			}else {
//				System.out.println("잘못된 접근\n프로그램 강제 종료");
//				th1.flag = false;
//			}
//			
//		} while(th1.flag != false);

	}

}
