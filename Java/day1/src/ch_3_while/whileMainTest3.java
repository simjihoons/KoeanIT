package ch_3_while;

public class whileMainTest3 {

	public static void main(String[] args) {
		// do-while
		int input = 10;
		int sum = 0;

		do {
			
			System.out.println("ÇöÀç °ª : " + input);
			sum += input;
			input--;

		} while (input != 0);

		System.out.println("ÃÑ ÇÕ : " + sum);
	}//end of main

}
