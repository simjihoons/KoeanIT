package ch5;

public class CarMainTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		Car manualCar = new ManualCar();

		aiCar.run();
		System.out.println("============");
		manualCar.run();

	}

}
