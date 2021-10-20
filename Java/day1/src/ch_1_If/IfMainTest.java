package ch_1_If;

public class IfMainTest {

	public static void main(String[] args) {
		//제어문 if
		//주어진 조건에 따라서 실행이 이루어 지도록 구현한다.
		//만약...이라면
		
		//boolean flag = true;
		boolean flag = false;
		
		//if문 단독 사용 방법
		if(flag) {
			System.out.println("조건식 결과가 ture이면 실행");
		}//end of if
		
		//if else문 
		if(flag) {
			System.out.println("ture이면 실행");
		}else {
			System.out.println("false이면 실행");
		}
	
		
		//if else if else문
		int point = 59;
		
		if(point >= 90 ) {
			System.out.println("A학점 입니다.");
		}else if(point >= 80){
			System.out.println("B학점 입니다.");
		}else if(point >= 70){
			System.out.println("C학점 입니다.");
		}else if(point >= 60){
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
		
		
		
			
	}

}
