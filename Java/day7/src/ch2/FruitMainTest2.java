package ch2;
import java.util.Scanner;

public class FruitMainTest2 {

	public static void main(String[] args) {
		final int BANANA = 1; 
		final int PEACH = 2; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("바나나 : 1번, 복숭아 : 2번 선택해주세요");
		int num = sc.nextInt();
		Fruit fruit = null;
		
		if(num == BANANA) {
			fruit = new Banana();
		}else if(num == PEACH) {
			fruit = new Peach();
		}else {
			System.out.println("1 또는 2번만 선택해주세요");
		}
		
		// 사용자가 입력한 값에 따라서 인스턴스를 쉽개
		// 바뀌 줄 수 있다.
		fruit.showInfo();
		
		sc.close();
	}	

}
