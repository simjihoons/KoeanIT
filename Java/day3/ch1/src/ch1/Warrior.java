package ch1;


public class Warrior {
	//멤버변수
	int str; //공격력
	int def; //방어력
	int wls; //지혜
	int hp; // 생명력
	int mp; //마나
	
	//멤버 함수 영역
	public void showInfo() {
		System.out.println("생명력 : "+hp+"\n마나 : "+mp+"\n공격력 : "+str+"\n방어력 : "+def+"\n지혜 : "+wls);
	}
	//의미없음
	//포션 먹기 체력 500 증가
	public void addHp() {
		System.out.println("\n포션 먹음 체력 증가 현재 생명력 "+(hp+500));
	}
}
