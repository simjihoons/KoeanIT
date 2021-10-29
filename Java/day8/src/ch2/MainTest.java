package ch2;

public class MainTest {

	public static void main(String[] args) {
		Televsion televsion = new Televsion();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyrobot = new ToyRobot();

//		televsion.trunOn();
//		televsion.trunOff();
//
//		System.out.println("====================");
//		refrigerator.trunOn();
//		refrigerator.trunOff();

		// 다형성 - 배(신체,과일,선박)
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televsion;
		remote[1] = refrigerator;
		remote[2] = toyrobot;
//
//		for (RemoteController remoteController : remote) {
//			remoteController.trunOn();
//		}
//
//		System.out.println("====================");
//
//		for (RemoteController remoteController : remote) {
//			remoteController.trunOff();
//		}

		// instanceOf 연산자 사용
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("장난감 객체" + i);
				System.out.println(((ToyRobot) remote[i]).name);
			}

			// tv라면 tv 입니다.

			if (remote[i] instanceof Televsion) {
				System.out.println("티비 객체" + i);
			}

			// 냉자고면 냉자고입니다.

			if (remote[i] instanceof Refrigerator) {
				System.out.println("냉장고 객체" + i);
			}

		}

		// 인터페이스 장점
		// 표준화 가능 하다.
		// 서로 관계 없는 클래스들에게 관계를 맺어 줄 수 있다.
		// 클래스 간에 결합도를 낮춰서 유연한 코드를 설계할 수 있다.
		
		
		// 정리
		// 객체지향 패러다임 핵심
		// 객체와 객체 간에 상호 협력해서 코드를 설계해 나간다.(버스,질럿 ---)
		// 객체와 객체 간에 관계를 정의하여 코드를 설계해 나간다.
		// (상속,포함관계,추상클래스,인터페이스) 다형성(클래스를 다양한 형태로)!!!
		
		
	}// EOM

}
