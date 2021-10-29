package ch2;

public class ToyRobot implements RemoteController, SoundEffect {
	String name;
	
	
	public ToyRobot() {
		this.name = "건담로봇";
	}


	@Override
	public void trunOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("장난감 로봇을 끕니다.");		
	}

	@Override
	public void notification() {
		System.out.println("두두루 쾅!!");
	}
	
}
