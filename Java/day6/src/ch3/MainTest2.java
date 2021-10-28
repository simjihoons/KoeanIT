package ch3;

class Cal {

	public int Sum(int n1, int n2) {
		return n1 + n2;
	}

	public int Multiply(int n1, int n2) {
		return n1 * n2;
	}

}

class Cal2 extends Cal {

	public int Minus(int n, int m) {
		return n - m;
	}
	
	// 오버라이드 (부모에 있는 메서드를 필요에 의해서 재정의 해서 사용하는 개념)
//	public int Multiply(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0은 입력x");
//		}
//			return n1 * n2;
//	}
	
	@Override
	public int Multiply(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0은 입력x");
		}
		return super.Multiply(n1, n2);
	}
}



public class MainTest2 {

	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();

		System.out.println(cal2.Sum(5, 3));
		System.out.println(cal2.Multiply(5, 0));
		System.out.println(cal2.Minus(5, 3));

	}

}
