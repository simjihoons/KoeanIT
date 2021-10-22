package ch2;

public class BusMainTest {

	public static void main(String[] args) {
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);

		bus101.take(2000);
		bus101.take(2000);
		bus101.showInfo();

		System.out.println("------------------");
		bus102.take(2000);
		bus102.take(1000);
		bus102.showInfo();
		//의미없음
	}

}
