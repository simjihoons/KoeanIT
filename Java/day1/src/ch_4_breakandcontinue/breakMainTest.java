package ch_4_breakandcontinue;

public class breakMainTest {

	public static void main(String[] args) {
		// �߰��� ���ߴ� break
		for (int i = 1; i < 11; i++) {
			System.out.println(i);

			if (i % 7 == 0) {
				break;
			}
		} // end of for

		
	}// end of main

}
