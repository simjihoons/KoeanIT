package homework;

public class Wizard {
	//멤버 변수]
	//hp ,power,name 등
		//다 get set으로 하기
	
	private String name;
	private int hp;
	private int mp;
	private int str; //공격력
	private int def; //방어력
	private int exp; // 경험치
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
