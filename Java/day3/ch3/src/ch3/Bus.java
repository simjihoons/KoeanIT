package ch3;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 메서드
	// 승객 태우기
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + "번의 승객은 ");
		System.out.println(passengerCount + "명 이고 ");
		System.out.println("현재 수입금은 " + money + "원 입니다.\n");
	}
	//의미없음
}
