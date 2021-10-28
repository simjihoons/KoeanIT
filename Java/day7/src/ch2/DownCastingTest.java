package ch2;

public class DownCastingTest {

	public static void main(String[] args) {
		// 1. 바나나 클래스에 origin 멤버변수 추가
		Fruit fruit = new Banana(); // 업 캐스팅

		// 컴파일 타임
		// 컴파일러는 부모타입 인스턴스 변수 타입을
		// 바라보고 있는 상태이기 때문에 아래의 코드는 에러가 난다.
		// fruit.origin;

		// 런타임

		// 다운 캐스팅을 통해 사용
		// 컴파일러에게 자식 객체 타입으로 바라보라고 명시하는것.
		String origin = ((Banana)fruit).origin;
		System.out.println("원산지 : "+origin);
	}

}
