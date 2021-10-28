package ch4;

public class DeskTop extends Computer {

	// 추상메서드 일반메서드로 재정의
	@Override
	public void display() {
		System.out.println("화면이 표시 됩니다.");
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타이핑 합니다.");
	}

}
