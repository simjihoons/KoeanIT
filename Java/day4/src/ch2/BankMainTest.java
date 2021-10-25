package ch2;

public class BankMainTest {

	public static void main(String[] args) {
		Bank bk1 = new Bank();

		bk1.deposit(10_000);
		bk1.showMoney();

		bk1.withdraw(5_000);
		bk1.showMoney();

		// 신입이 실수로 멤버 변수에 바로 접근해서 잔액을 수정함
		// 잔액이 105_000이 되어야 하는데 덮어씌였다.
		// 접근제어자를 이용해 직접적으로 접근하지 못하게 private을 사용한다.
		// bk1.balance = 100_000;
		// bk1.showMoney();

		// getter,setter
		// read only
		int returnMoney = bk1.getBalance();
		System.out.println(returnMoney);

		// setter 사용
		bk1.setBalance(-100);
		bk1.showMoney();

		// 접근제어지시자
		// 총 4가지가 있다.
		// public - 누구나 접근을 허용
		// default - 같은 패키지 내에서 접근을 허용 //멤버변수 앞에 아무것도 적지 않는 것
		// protected - 상속관계에서 접근을 허용 한다.
		// private - 같은 클래스 내부에서만 접근 가능 ( 외부 클래스, 상속 관계의 클래스에서도 접근 불가)

		// public 클래스는 .java 파일 안에서 하나만 사용가능하다.
		
	}

}
