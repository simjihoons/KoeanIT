package ch_2_for;

public class forMainTest3 {

	public static void main(String[] args) {
		/*
		//���� for�� ����
		for(int i =1; i <10; i++) {
			for(int j = 1; j<10; j++) {
				
			}
		}
		*/

		//������(2�ܺ���)
		//��, ����for�� Ȱ���ؾ���.
		for(int i = 2; i<10; i++) {
			System.out.printf("====%d��====\n",i);
			for(int j = 1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		

		//������(9 * 9 ���� ������) 
//		for(int i = 9; i>1; i--) {
//			System.out.printf("====%d��====\n",i);
//			for(int j =9; j>0; j--) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}

	}//end of main

}
