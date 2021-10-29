package ch2;

public interface RemoteController {
	// 인터페이스란
	// 구현된 것이 아무것도 없는 밑 그림만 있는 기본 설계도
	// 멤버 변수, 일반 메서드를 가질 수 없다.
	// 오직 추상 메서드와 상수만을 멤버로 가질 수 있다.
	// 추상클래스보다 추상화가 더 높다.
	// 인터페이스는 표준,약속,규칙 이다.

	// 사용 방법
	// class 대신 interface라는 키워드를 사용한다.
	// class와 같이 접근 제어 지시자를 public 이나 default를 가진다.

	// 제약 사항
	// 모든 멤버 변수는 public static final 이어야 한다.
	public static final int SERIAL_NUMBER = 1000; // 상수

	// 모든 메서드는 추상 메서드 이어야 하고, public abstract 키워드를
	// 생략 할 수도 있다.
	public abstract void trunOn(); // 생략 전

	void trunOff(); // 생략 후

}
