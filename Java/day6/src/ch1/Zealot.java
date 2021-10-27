package ch1;

public class Zealot {
	// 공격력 , 생명력 etc..
	private int power;
	private int hp;
	private String name;

	public Zealot(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

	public String getName() {
		return name;
	}

	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name + "\n공격력 : " + this.power + "\n생명력 : " + this.hp);
		System.out.println("==========");
	}

	// 공격 -> 질럿이 마린을 공격하는 동작
	// 다른 객체와 상호작용 - 메서드로 참조 변수 전달
//	public void attackMarine(Marine marine) {
//		System.out.println(this.name + "이 " + marine.getName() + "을 공격 합니다.");
//		marine.beAttacked(this.power);
//	}
//
//	public void attackZergling(Zergling zergling) {
//		System.out.println(this.name + "이 " + zergling.getName() + "을 공격 합니다.");
//		zergling.beAttacked(this.power);
//	}

	public void beAttacked(int power) {
		// System.out.println(name + "이 사망했습니다.");
		this.hp -= power;
		if(this.hp <=0) {
			System.out.println(this.name + "은 사망");
			this.hp = 0;
		}
	}

	// 메서드 오버로딩 사용
	public void attack(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격 합니다.");
		marine.beAttacked(this.power);
	}

	public void attack(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격 합니다.");
		zergling.beAttacked(this.power);
	}
}
