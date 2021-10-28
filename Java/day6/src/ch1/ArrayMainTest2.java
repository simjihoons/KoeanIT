package ch1;

public class ArrayMainTest2 {

	public static void main(String[] args) {
		// 연관된 데이터를 통으로 모아서 관리하기 위한 것
		int[] nums = new int[12];
		
		// 질럿을 담을 수 있는 배열을 12칸 생성
		Zealot[] zealots = new Zealot[12];

		// 마린 
		Marine[] marines = new Marine[12];
		
		// 저글링
		Zergling[] zerglings = new Zergling[12];
		
		// 질럿 12마리 생성 (배열은 for문과 함께 많이 사용)
		for(int i =0; i<zealots.length; i++) {
			zealots[i] = new Zealot("질럿"+(i+1));
		}
		
		// 마린 12마리 생성
		for(int i =0; i<marines.length; i++) {
			marines[i] = new Marine("마린"+(i+1));
		}
		
		// 저글링 12마리 생성
		for(int i =0; i<zerglings.length; i++) {
			zerglings[i] = new Zergling("저글링"+(i+1));
		}
		
		// 질럿 12마리 정보출력
		for(int i=0; i<zealots.length;i++) {
			zealots[i].showInfo();
		}
		
		
		
	}

}
