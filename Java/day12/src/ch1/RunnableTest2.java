package ch1;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame {
	int grade = 10;

	public MyRunnable2() {
//		runable.run();
	}

	// 자바 문법
	// 구현 객체
	Runnable runable = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < grade; i++) {
				System.out.print("--");

				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	};
}

public class RunnableTest2 {

	public static void main(String[] args) {
		MyRunnable2 r = new MyRunnable2();

		// 문제 1. 객체 생성과 동시에 run 메서드 실행
//		MyRunnable 클래스 생성자에서 수정
//		public MyRunnable2() {
//			runable.run();
//		}
		
		// 문제 2. 외부에서 동작
		r.runable.run();
	}

}
