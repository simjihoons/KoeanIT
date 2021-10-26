package homework;

public class Warrior {
//멤버 변수
//hp ,power,name 등
//다 get set으로 하기
	private String name;
	private String skillName;
	private int hp;
	private int mp;
	private int str; // 공격력
	private int def; // 방어력
	private int exp; // 경험치
	private int level; // 레벨

	// 생성자 영역
	public Warrior() {
		// 다른 생성자 호출, 기본상태창
		this("이름없음","스킬이름없음", 100, 100, 10, 5, 0, 1);
	}

	public Warrior(String name) {
		this.name = name;
	}

	public Warrior(String name, String skillName, int hp, int mp, int str, int def, int exp, int level) {
		this.name = name;
		this.skillName = skillName;
		this.hp = hp;
		this.mp = mp;
		this.str = str;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}

	// get,set 영역
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	// 메서드 영역
	public void attack() {	
		exp += 50;
		System.out.println(name + "이(가) " + this.skillName + " 기술로 공격 합니다.\n");
		if (exp == 100 || exp>100) {
			System.out.println("\n!!!레벨업!!!\n");
			exp = 0;
			level++;
			
		}

	}

	public void showInfo() {
		// 상태창
		System.out.println("이름 : " + this.name + "\n레벨 : " + this.level + "\n체력 : " + this.hp + "\n마나 : " + this.mp
				+ "\n공격력 : " + this.str + "\n방어력 : " + this.def + "\n경험치 : " + this.exp);
	}

	public static void main(String[] args) {
		Warrior w1 = new Warrior("홍길동");

//		String name = w1.getName();
//		System.out.println(name);
//
//		w1.setName("이순신");
//		w1.setSkillName("벽력일섬");
		//w1.attack();
		// w1.showInfo();

		System.out.println("=================================");
		Warrior w2 = new Warrior();
		w2.setName("젠이츠");
		w2.setSkillName("벽력일섬");
		w2.attack();
		w2.attack();
		w2.showInfo();

		
	}

}
