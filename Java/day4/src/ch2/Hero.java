package ch2;

public class Hero {
	private String name;
	private int hp;
	private double defense; // ����
	private int level;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		// ����� �ڵ� �ۼ�
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("�߸��� �Է� �Դϴ�. �̸��� �ٽ� �ۼ��� �ּ���");
		} else {
			this.name = name;
		}

	}

	// -------------------------------------------------------

	// hp
	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// defense
	public double getDefense() {
		return this.defense;
	}

	public void setDefense(double def) {
		defense = def;
	}

	// level
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public static void main(String[] args) {
		// hero ��ü ���� �� getter,setter ���
		Hero hero = new Hero();

		hero.setName("Ironman");
		String name = hero.getName();
		System.out.println(name);

		System.out.println("-----------hp-------------");

		hero.setHp(100);
		int hp = hero.getHp();
		System.out.println(hp);

		System.out.println("-----------def-------------");
		hero.setDefense(10.5);
		double def = hero.getDefense();
		System.out.println(def);

		System.out.println("-----------level-------------");
		hero.setLevel(10);
		int level = hero.getLevel();
		System.out.println(level);

		
		
	}

}
