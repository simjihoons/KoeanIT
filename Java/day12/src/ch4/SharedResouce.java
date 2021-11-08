package ch4;

class BankAccount {
	private int money = 100_000;

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력");
		} else {
			this.money = money;
		}
	}

	// 입금
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();

		try {
			Thread.sleep(3000); // 3초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());

	}

	// 출금
	public void withdrawMoney(int money) {

		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Todo
			// 현재 금액보다 큰 값을 출금하려 할때 에러 출력
			if (money > currentMoney) {
				System.out.println("잔액 보다 큰 금액입니다.");
			} else {
				setMoney(currentMoney - money);
			}

			System.out.println("출금 후 계좌 잔액 : " + getMoney());

		}

	}

}

class Father extends Thread {
	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 입금하기
		account.saveMoney(10_000);

	}
}

class Mother extends Thread {
	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 출금하기
		account.withdrawMoney(5_000);

	}
}

public class SharedResouce {

	public static void main(String[] args) {

		// 현재 100_000 만원이 저금되어 있는 상태로 객체 생성
		BankAccount account = new BankAccount();

		Father father = new Father(account);
		Mother mother = new Mother(account);

		father.start();

		mother.start();

		// 위 의 결과는 105_000이 되어야하는데
		// 시간을 준것의 결과에 따라 110_000원 이 된다.
		// 이를 해결하기 위해 동기화를 사용한다.

		// 동기화
		// 임계 영역이 발생 될때는 (작업자 간에 자원을 공유하는 상태)
		// 현재 자원(데이터) 사용하고 있기 때문에 보호 처리를 해주어야 한다.
		// 다른 작업자가 사용하지 못하도록 lock을 걸어 준다.
		// 순서를 지켜서 작업을 하게 한다.

		// 하는 방법
		// 1. synchronized 메서드
		// 입금 기능
		// public synchronized void saveMoney(int money)

		// 출금 기능
		// 2. synchronized 블록

	}

}
