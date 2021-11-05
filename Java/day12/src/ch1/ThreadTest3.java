package ch1;

class MyThread3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i+" : "+Thread.currentThread());
		}

	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		MyThread3 th1 = new MyThread3();
		MyThread3 th2 = new MyThread3();		
		MyThread3 th3 = new MyThread3();		
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
