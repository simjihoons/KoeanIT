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
	
	
	

	public int getPower() {
		return power;
	}


	public int getHp() {
		return hp;
	}
	

	public String getName() {
		return name;
	}

	public void attack() {}

	public void beAttacked(int power) {
		// System.out.println(name + "이 사망했습니다.");
		hp -= power;
		if(hp <=0) {
			System.out.println(this.name + "은 사망");
			hp = 0;
		}
	}
	
	
	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name + "\n공격력 : " + this.power + "\n생명력 : " + this.getHp());
		System.out.println("==========");
	}




	

	
	
}
