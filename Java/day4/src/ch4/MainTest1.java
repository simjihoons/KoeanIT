package ch4;

public class MainTest1 {

	public static void main(String[] args) {
		NumberPrinter np1 = new NumberPrinter(1);
		NumberPrinter np2 = new NumberPrinter(2);
		NumberPrinter np3 = new NumberPrinter(3);

		np3.printWaitNumber();
		np3.printWaitNumber();
		np3.printWaitNumber();

		System.out.println("===============================");

		np1.printWaitNumber();
		np1.printWaitNumber();
		np1.printWaitNumber();

		System.out.println("===============================");

		np2.printWaitNumber();
		np2.printWaitNumber();
		np2.printWaitNumber();
	}// end of main

}
