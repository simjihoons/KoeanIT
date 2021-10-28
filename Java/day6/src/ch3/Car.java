package ch3;

public class Car {
	String name;
	int price;

	// 포함 관계로 만든다. (has a 관계)
	Engine engine;

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		engine = new Engine("GDI", 500);
	}

	public void showInfo() {
		System.out.println("name : " + name + "\nprice : " + price);
	}
	
}
