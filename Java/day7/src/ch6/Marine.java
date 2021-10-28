package ch6;

public class Marine extends Unit{
	
	public Marine(int power,int hp , String name) {
		super(power,hp,name);
	}
	
	public void attackZealot(Unit zealot) {
		System.out.println(super.getName() + "이 " + zealot.getName() + "을 공격 합니다.");
		zealot.beAttacked(super.getPower());
	}
	
	
	public void attackZergling(Unit zergling) {
		System.out.println(super.getName() + "이 " + zergling.getName() + "을 공격 합니다.");
		zergling.beAttacked(super.getPower());
	}

	
}
