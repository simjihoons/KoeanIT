package ch2;

public class FruitMainTest3 {

	public static void main(String[] args) {
		// 다형성 : 배열(자료구조) 관계에서도 사용 가능
		// 하나의 변수에 연관된 데이터를 통으로 관리하기 위해 사용
		Banana b1 = new Banana();
		Banana b2 = new Banana();
		
		Banana[] bananaBuket = new Banana[2];
		bananaBuket[0] = b1;
		bananaBuket[1] = b2;
		
//		for(Banana b : bananaBuket) {
//			b.showInfo();
//		}
		
		System.out.println("===================");
		//복숭아
		Peach p1 = new Peach();
		Peach p2 = new Peach();
		
		// 배열사용해서 담기
		Peach[] peachBuket = new Peach[2];
		peachBuket[0] = p1;
		peachBuket[1] = p2;
		//for문으로 showInfo 호출
		for(Peach p : peachBuket) {
			p.showInfo();
		}
		System.out.println("===================");
		// 다형성을 사용하여 구현
		Fruit[] buket = new Fruit[4];
		buket[0] = b1;
		buket[1] = p1;
		buket[2] = b2;
		buket[3] = p2;
		
		for(Fruit b : buket) {
			b.showInfo();
		}
	}

}
