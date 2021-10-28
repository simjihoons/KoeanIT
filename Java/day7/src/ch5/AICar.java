package ch5;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI가 차를 운전합니다.");

	}

	@Override
	public void stop() {
		System.out.println("AI가 차를 멈춥니다.");
	}

	@Override
	public void wiper() {
		System.out.println("AI가 와이퍼를 작동시킵니다.");
	}

	public void washCar() {
		System.out.println("ai가 차를 씻깁니다.");
	}
}
