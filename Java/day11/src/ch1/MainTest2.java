package ch1;


public class MainTest2 {

	public static void main(String[] args) {
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		Powder powder = new Powder();
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial());
		
		System.out.println("===========================");
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		
		System.out.println("===========================");
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		//printer3.setMaterial(plastic);
		Powder temp1 = (Powder) printer3.getMaterial();
		System.out.println(temp1);
		
		System.out.println(printer3);
	}

}
