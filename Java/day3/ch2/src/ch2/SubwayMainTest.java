package ch2;

public class SubwayMainTest {

	public static void main(String[] args) {
		Subway sub1 = new Subway(1);
		Subway sub2 = new Subway(2);
		Subway sub3 = new Subway(3);
		
		sub1.take(2000);
		sub1.showInfo();
		//의미없음//의미없음
		System.out.println("-----------------");
		sub2.take(2000);
		sub2.take(1000);
		sub2.take(500);
		sub2.showInfo();
		
		System.out.println("-----------------");
		sub3.take(2000);
		sub3.take(1000);
		sub3.showInfo();
		
	}

}
