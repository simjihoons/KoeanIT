package ch3;

public class MainTest1 {

	public static void main(String[] args) {
		// Bus
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);

		// 학생
		Student std1 = new Student("홍길동", 10_000);
		Student std2 = new Student("야스오", 50_000);
		Student std3 = new Student("티모", 20_000);

		// 지하철
		Subway sub1 = new Subway(1);
		Subway sub2 = new Subway(2);
		Subway sub3 = new Subway(3);

		std1.takeBus(bus300);
		std1.takeSubway(sub1);
		std1.showInfo();

		std2.takeSubway(sub1);
		std2.takeBus(bus100);
		std2.showInfo();

		std3.takeBus(bus200);
		std3.takeSubway(sub2);
		std3.showInfo();
		//의미없음
		System.out.println("=========================");
		bus100.showInfo();
		bus200.showInfo();
		bus300.showInfo();
		System.out.println("=========================");
		sub1.showInfo();
		sub2.showInfo();
		sub3.showInfo();
		System.out.println("=========================");

//
//		// 학생이 버스를 탄다.
//		std1.takeBus(bus100);
//
//		// 버스의 정보
//		bus100.showInfo();
//
//		System.out.println("----------");
//
//		// 학생의 정보
//		std1.showInfo();
//
//		System.out.println("-----------------------");
//
//		std2.takeBus(bus100);
//		std2.showInfo();
//		System.out.println("----------");
//		bus100.showInfo();
//
//		System.out.println("-----------------------");
//		System.out.println("-----------------------");
//		
//		//집에 갈때는 지하철을 타고 간다.
//		std1.takeSubway(sub1);
//		sub1.showInfo();
//
//		System.out.println("-----------------------");
//		std1.showInfo();

	}

}
