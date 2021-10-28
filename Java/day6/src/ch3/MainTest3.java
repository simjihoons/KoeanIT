package ch3;

public class MainTest3 {

	public static void main(String[] args) {
		//자동차 생성
		Car car1 = new Car("benz",1000);
		car1.showInfo();
		
		//엔진의 정보
		car1.engine.showInfo();
	}

}
