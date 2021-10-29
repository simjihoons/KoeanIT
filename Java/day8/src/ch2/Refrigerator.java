package ch2;

//인터페이스를 구현하는 방법
public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {
	@Override
	public void trunOn() {
		System.out.println("냉장고를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("냉장고를 끕니다.");
	}

	@Override
	public void notification() {
		System.out.println("무니 열리네요오~");
	}

}
