package ch2;

public class Televsion extends HomeAppliances implements RemoteController {
	@Override
	public void trunOn() {
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("Tv를 끕니다.");
	}

}
