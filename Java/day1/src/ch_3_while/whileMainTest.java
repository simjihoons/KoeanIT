package ch_3_while;

public class whileMainTest {

	public static void main(String[] args) {
		//1~10까지 합
		int num = 1;
		int sum = 0;
		while(num<=10) {
			System.out.println("현재 값 : "+num);
			sum += num;
			num++;
			
			try {//예외처리
				Thread.sleep(500);//0.5초 ()는 밀리세컨드 단위
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end of while
		System.out.println("연산의 결과 값은 : "+sum+"입니다.");
		
	}//end of main

}
