package ch6;

public class UnitMainTest {

	public static void main(String[] args) {
		Unit zealot = new Zealot(10, 100, "질럿1");
		Unit marine = new Marine(7, 100, "마린2");
		Unit zergling = new Zergling(5, 100, "저글링3");
		
//		System.out.println("==========상태창========");
//		zealot.showInfo();
//		marine.showInfo();
//		zergling.showInfo();
//		System.out.println("=====================");
//		
		// 질럿이 마린을 공격
		((Zealot) zealot).attackMarine(marine);
		marine.showInfo();
		
		// 질럿이 저글링을 공격
		((Zealot) zealot).attackZergling(zergling);
		zergling.showInfo();
		
		System.out.println("========================");
		
		// 마린이 질럿을 공격
		((Marine) marine).attackZealot(zealot);
		zealot.showInfo();
		
		// 마린이 저글링을 공격
		((Marine) marine).attackZergling(zergling);
		zergling.showInfo();
		
		System.out.println("========================");
		
		// 저글링이 질럿을 공격
		((Zergling) zergling).attackZealot(zealot);
		zealot.showInfo();
		// 저글링이 마린을 공격
		((Zergling) zergling).attackMarine(marine);
		marine.showInfo();
	}

}
