package ch6;

public class Unit {
	private int power;
	private int hp;
	private String name;

	public Unit(int power, int hp, String name) {
		this.power = power;
		this.hp = hp;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void beAttacked(int power) {
		hp -= power;
		if (hp <= 0) {
			System.out.println(this.name + "은 사망");
			hp = 0;
		}
	}

	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.getName() + "을 공격 합니다.");
		unit.beAttacked(this.power);
	}
	
	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name + "\n공격력 : " + this.power + "\n생명력 : " + this.hp);
		System.out.println("==========");
	}

}
