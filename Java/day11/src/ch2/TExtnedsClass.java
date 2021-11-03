package ch2;

public class TExtnedsClass {

	public static void main(String[] args) {

		// <T extends Class> 사ㅛㅇ하기
		// T 자료형의 범위를 제한 할 수 있음
		// 제한하지 않으면 자료형으로 아무 클래스나 올 수 있다.
		
		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		System.out.println("============");
		
		//GenericPrinter2<Water> printer2 = new GenericPrinter2<>();
		
	}

}
