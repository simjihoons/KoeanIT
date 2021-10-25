package ch2;

public class Bank {

	// 정보 은닉
	// 필요에 따라 get,set 설정
	private int balance; // 잔액

	// 입금 메서드
	public void deposit(int money) {
		this.balance += money;
		// System.out.println(money+"원 입금\n");
	}

	// 출금 메서드
	public int withdraw(int money) {
		this.balance -= money;
		// System.out.println(money+"원 출금\n");
		return balance;
	}

	// 잔액 정보
	public void showMoney() {
		System.out.println("현재 잔액은 : " + this.balance + "원 입니다.");

	}

	// getter 메서드 생성 , 멤버변수에 대한 정보를 메서드를 통해서 넘겨준다.
	// 일반적으로 get() 메서드를 만들어서 외부에서 확인할 수 있도록 구현
	public int getBalance() {
		return this.balance;
	}

	// setter 메서드 생성
	// 일반적으로 set() 메서드를 제공해서 외부에서 멤버 변수에 접근할 수 있도록 구현
	public void setBalance(int balance) {
		if(balance <0) {
			System.out.println("잘못된 입력 입니다.");
		}else {
			this.balance = balance;
		}
		
	}

}
