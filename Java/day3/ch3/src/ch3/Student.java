package ch3;

public class Student {
	String name;
	int money;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 학생이 버스를 탄다.(객체와 객체간에 상호작용하게 코드를 설계)
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}

	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	// 메서드
	// 정보창
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은" + money + "원 입니다.\n");
	}
	
	//의미없음

}
