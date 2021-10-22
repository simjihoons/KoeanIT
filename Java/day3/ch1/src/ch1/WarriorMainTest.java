package ch1;

public class WarriorMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior warrior = new Warrior();
		
		warrior.hp = 1000;
		warrior.mp = 500;
		warrior.str = 35;
		warrior.def = 30;
		warrior.wls = 1;
		//의미없음
		warrior.showInfo();
		warrior.addHp();
	}

}
