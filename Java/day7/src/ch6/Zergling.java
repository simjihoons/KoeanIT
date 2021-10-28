package ch6;

public class Zergling extends Unit{
	
	

	public Zergling(int power, int hp, String name) {
		super(power, hp, name);
	}


	public void attackMarine(Unit marine) {
		System.out.println(super.getName() + "이 " + marine.getName() + "을 공격 합니다.");
		marine.beAttacked(super.getPower());
	}
	
	
	public void attackZealot(Unit zealot) {
		System.out.println(super.getName() + "이 " + zealot.getName() + "을 공격 합니다.");
		zealot.beAttacked(super.getPower());
	}
}
