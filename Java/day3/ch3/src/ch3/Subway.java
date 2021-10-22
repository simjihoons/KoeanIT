package ch3;

public class Subway {
	//호선 번호
	//승객수
	//수익금
	int subNum;
	int passengerCount;
	int money;
	
	//생성자-호선번호
	//public Subway() {}
	
	public Subway(int subNum) {
		this.subNum = subNum;
	}
	
	//메서드take , 정보출력
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(subNum+"호선의 승객은 ");
		System.out.println(passengerCount + "명 이고 ");
		System.out.println("현재 수입금은 " + money + "원 입니다.\n");
	}
	//의미없음
}
