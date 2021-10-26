package StarCraft;

public class HatcheryMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hatchery h1 = new Hatchery(1);
		Zergling z1 = h1.createZergling();
		Zergling z2 = h1.createZergling();
		Zergling z3 = h1.createZergling();
		Zergling z4 = h1.createZergling();
		Zergling z5 = h1.createZergling();
		Zergling z6 = h1.createZergling();
	
		
		System.out.println("현재 저글링 수 : "+Hatchery.zerglingCount);
	}

}
