package ch2;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus() {
	}

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

//	public Bus(int busNumber, int passengerCount) {
//		this.busNumber = busNumber;
//		this.passengerCount = passengerCount;
//	}
//
//	public Bus(int busNumber, int passengerCount, int money) {
//		this.busNumber = busNumber;
//		this.passengerCount = passengerCount;
//		this.money = money;
//	}
	//의미없음
	// 메서드
	// 승객 태우기
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + "번의 승객은 ");
		System.out.println(passengerCount + "명 이고 ");
		System.out.println("현재 수입금은 " + money + "원 입니다.");
	}
}
