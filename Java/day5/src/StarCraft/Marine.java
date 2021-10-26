package StarCraft;

public class Marine {
	private int power;
	private int hp;
	private String name;

	public Marine(String name) {
		this.name = name;
		this.power = 6;
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name + "\n공격력 : " + this.power + "\n생명력 : " + this.hp);
		System.out.println("==========");
	}

	// 공격 당함
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <=0) {
			System.out.println(this.name + "은 사망");
			this.hp = 0;
		}
	}

	public String getName() {
		return name;
	}

//	public void attackZealot(Zealot zealot) {
//		System.out.println(this.name + "이 " + zealot.getName() + "을 공격 합니다.");
//		zealot.beAttacked(this.power);
//	}
//
//	public void attackZergling(Zergling zergling) {
//		System.out.println(this.name + "이 " + zergling.getName() + "을 공격 합니다.");
//		zergling.beAttacked(this.power);
//	}

	public void attack(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격 합니다.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격 합니다.");
		zergling.beAttacked(this.power);
	}
}
