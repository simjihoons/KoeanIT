package ch2;

import ch1.Plastic;
import ch1.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 사용할 때 자료형을 넣어주면 된다.
		// 사용 방법 : T 대신 어떤 자료형을 사용할지 지정해 주면 된다.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>(); // 원랜 Powder대신 T가 들어가있음
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();

		// 재료 넣기
		genericPrinter1.setMaterial(powder);
		Powder tmp = genericPrinter1.getMaterial();
		System.out.println(tmp);

		System.out.println("================================");

		genericPrinter2.setMaterial(plastic);
		Plastic tmp2 = genericPrinter2.getMaterial();
		System.out.println(tmp2);

		System.out.println("================================");

		System.out.println(genericPrinter1);
		System.out.println(genericPrinter2);

	}

}
