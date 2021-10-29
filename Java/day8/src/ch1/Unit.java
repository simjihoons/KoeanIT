package ch1;

// new 키워드를 사용해서 메모리에 올릴수 없다. 타입으로만 사용한다.
public abstract class Unit {
	protected int power;
	protected int hp;
	protected String name;

	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "은 사망");
			this.hp = 0;
		}
	}

	public String getName() {
		return this.name;
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
