package ch4;

public abstract class NoteBook extends Computer {
	// 추상메서드 일반메서드로 재정의
	@Override
	public void typing() {
		System.out.println("노트북 키보드로 타이핑 합니다.");
	}

}
