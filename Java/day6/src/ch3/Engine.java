package ch3;

public class Engine {
	String name;
	int price;

	public Engine(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void showInfo() {
		System.out.println("name : " + name + "\nprice : " + price);
	}
}
