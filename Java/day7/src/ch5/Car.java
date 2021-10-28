package ch5;

public abstract class Car {

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	public abstract void drive();

	public abstract void stop();

	public abstract void wiper();

	// 후크(hook)메서드
	// 필요할때 재정의 하여 사용
	public void washCar() {}
	
	// 템플릿 메서드
	// 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
	// final로 하위 클래스에서 재정의 할 수 없게 함
	final public void run() {
		startCar();
		drive();
		washCar();
		wiper();
		stop();
		turnOff();
		
	}
}
