package ch_2_for;

public class forMainTest3 {

	public static void main(String[] args) {
		/*
		//이중 for문 구조
		for(int i =1; i <10; i++) {
			for(int j = 1; j<10; j++) {
				
			}
		}
		*/

		//구구단(2단부터)
		//단, 이중for문 활용해야함.
		for(int i = 2; i<10; i++) {
			System.out.printf("====%d단====\n",i);
			for(int j = 1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		

		//구구단(9 * 9 부터 역으로) 
//		for(int i = 9; i>1; i--) {
//			System.out.printf("====%d단====\n",i);
//			for(int j =9; j>0; j--) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}

	}//end of main

}
