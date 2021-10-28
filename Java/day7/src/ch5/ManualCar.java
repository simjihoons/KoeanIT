package ch5;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("운전자가 차를 운전합니다.");

	}

	@Override
	public void stop() {
		System.out.println("운전자가 차를 멈춥니다.");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 와이퍼를 작동시킵니다.");
	}

}
