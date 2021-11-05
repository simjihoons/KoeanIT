package ch1;

import javax.swing.JFrame;

// Runnable 인터페이스를 구현하여 만들면 된다.
class MyRunnable1 extends JFrame implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}

}

public class RunnableText {

	public static void main(String[] args) {
		MyRunnable1 r = new MyRunnable1();
		
		// Runnable을 구현한 객체는 스레드를 생성해서 매개 변수에 담고 스레드를 시작한다.
		Thread th1 = new Thread(r);
		th1.start();
		 
		
		Thread th2 = new Thread(r);
		th2.start();
		
	}

}
