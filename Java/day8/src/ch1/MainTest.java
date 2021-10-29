package ch1;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		zealot.attack(zergling);
//		zergling.showInfo();
//		
		// 스캐너를 사용해 실행에 흐름을 만들어 준다.
		// 1 질럿이 마린을 공격
		// 2 마린이 저글링을 공격
		// 3 저글링이 질럿을 공격

		// System.out.println("1. 질럿이 마린을 공격\n2. 마린이 저글링을 공격\n3. 저글링이 질럿을 공격");
		// int unitNum = sc.nextInt();

//		if (unitNum == 1) {
//			zealot.attack(marine);
//			marine.showInfo();
//		}else if(unitNum == 2) {
//			marine.attack(zergling);
//			zergling.showInfo();
//		}else if(unitNum == 3) {
//			zergling.attack(zealot);
//			zealot.showInfo();
//		}else {
//			System.out.println("1~3번 중에서만 선택");
//		}
//		

//		while () {

		System.out.println("1. 유닛 생성\n2. 공격\n3. 상태창\n4. 나가기");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("====생성 유닛 선택====\n1. 질럿\n2. 마린\n3. 저글링\n4. 나가기");
			int unitNum = sc.nextInt();

			if (unitNum == 1) {
				System.out.println("질럿 이름 : ");
				String name = sc.next();
				Zealot zealot = new Zealot(name);
			} else if (unitNum == 2) {
				Marine marine = new Marine("마린");
			} else if (unitNum == 3) {
				Zergling zergling = new Zergling("저글링");
			} else {
				System.out.println("1~3번중에 선택하세요");
			}

		case 2:

		case 3:

		case 4:
			break;
		}
//		}

	}// EOM

}
