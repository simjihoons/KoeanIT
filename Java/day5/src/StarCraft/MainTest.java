package StarCraft;

public class MainTest {

	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Marine m1 = new Marine("마린1");
		Zergling ze1 = new Zergling("저글링1");

//		z1.showInfo();
//		m1.showInfo();
//		ze1.showInfo();

//		System.out.println("=======================");

//		z1.attackMarine(m1);
//		m1.showInfo();
//		
//		z1.attackZergling(ze1);
//		ze1.showInfo();
//		
//		// 1. 마린이 질럿 공격
//		m1.attackZergling(ze1);
//		ze1.showInfo();
//		// 2. 마린이 저글링 공격
//		m1.attackZealot(z1);
//		z1.showInfo();
//		
		// 저글링 질럿 마린 의 hp가 0이하 라면 사망했습니다 출력
//		z1.attackMarine(m1);
//		m1.showInfo();

		System.out.println("=========================");
		z1.attack(m1);
		m1.showInfo();
	}

}
