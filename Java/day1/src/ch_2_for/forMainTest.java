package ch_2_for;

public class forMainTest {

	public static void main(String[] args) {
		/*
		 * for(초기화식; 조건식; 증감식){
		 * 		수행문;
		 * }
		 * 
		 */
		
		//1~10까지 총 합
		//연산에 담을 결과를 위해 변수가 필요함
		int sum =0;
		for(int i=1; i<=10;i++) {
			sum += i;
			//System.out.println("i의 현재 값 : "+i);
		}//end of for
		System.out.println("sum : "+sum);
		
		
		
	}//end of main

}//end of class
