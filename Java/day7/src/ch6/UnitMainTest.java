package ch6;

public class UnitMainTest {

	public static void main(String[] args) {
		Unit zealot = new Zealot(10, 100, "질럿1");
		Unit marine = new Marine(7, 100, "마린2");
		Unit zergling = new Zergling(5, 100, "저글링3");
		
		zealot.attack(zergling);
		
	}

}
