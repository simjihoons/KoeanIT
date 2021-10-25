package homework;

public class Warrior {
//��� ����]
//hp ,power,name ��
//�� get set���� �ϱ�
	private String name;
	private String skillName;
	private int hp;
	private int mp;
	private int str; // ���ݷ�
	private int def; // ����
	private int exp; // ����ġ
	private int level; // ����

	// ������ ����
	public Warrior() {
		// �ٸ� ������ ȣ��, �⺻����â
		this("�̸�����","��ų�̸�����", 100, 100, 10, 5, 0, 1);
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

	// get,set ����
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

	// �޼��� ����
	public void attack() {	
		exp += 50;
		System.out.println(name + "��(��) " + this.skillName + " ����� ���� �մϴ�.\n");
		if (exp == 100 || exp>100) {
			System.out.println("\n!!!������!!!\n");
			exp = 0;
			level++;
		}

	}

	public void showInfo() {
		// ����â
		System.out.println("�̸� : " + this.name + "\n���� : " + this.level + "\nü�� : " + this.hp + "\n���� : " + this.mp
				+ "\n���ݷ� : " + this.str + "\n���� : " + this.def + "\n����ġ : " + this.exp);
	}

	public static void main(String[] args) {
		Warrior w1 = new Warrior("ȫ�浿");

//		String name = w1.getName();
//		System.out.println(name);
//
//		w1.setName("�̼���");
//		w1.setSkillName("�����ϼ�");
		//w1.attack();
		// w1.showInfo();

		System.out.println("=================================");
		Warrior w2 = new Warrior();
		w2.setName("������");
		w2.attack();
		//w2.attack();
		w2.showInfo();

		
	}

}
