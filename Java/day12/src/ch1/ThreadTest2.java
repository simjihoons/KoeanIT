package ch1;

class MyThreadEx extends Thread {
	String name;

	public MyThreadEx(String name) {
		this.name = name;
	}

	// 약속
	@Override
	public void run() {
		int i;
		for (i = 0; i < 50; i++) {
			System.out.println(name + " : " + i + "\t");

			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}// end of run

}// end of mythread

public class ThreadTest2 {

	// 메인 스레드
	public static void main(String[] args) {
		// 현재 스레드가 누구인지 찍어줌
		System.out.println(Thread.currentThread());
		System.out.println("메인 스레드 시작");

		MyThreadEx th1 = new MyThreadEx("작업자1");
		// 스레드에 작업을 시작하는 명령어
		th1.start();

		MyThreadEx th2 = new MyThreadEx("작업자2");
		th2.start();
		
		MyThreadEx th3 = new MyThreadEx("작업자3");
		th3.start();
		
//		for (int i = 0; i < 50; i++) {
//			System.out.println("test"+i);
//			
//			try {
//				Thread.sleep(200);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
		System.out.println("메인 스레드 종료");
	}

}
