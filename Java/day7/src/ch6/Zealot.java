package ch6;

public class Zealot extends Unit{

	public Zealot(int power, int hp, String name) {
		super(power, hp, name);
	}


	public void attackMarine(Unit marine) {
		System.out.println(super.getName() + "이 " + marine.getName() + "을 공격 합니다.");
		marine.beAttacked(super.getPower());
	}
	
	
	public void attackZergling(Unit zergling) {
		System.out.println(super.getName() + "이 " + zergling.getName() + "을 공격 합니다.");
		zergling.beAttacked(super.getPower());
	}
}
