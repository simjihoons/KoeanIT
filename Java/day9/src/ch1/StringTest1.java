package ch1;

public class StringTest1 {

	public static void main(String[] args) {
		// String 선언 방식
		// heap 메모리에 인스턴스로 생성되는 경우
		// heap 이라는 동적 메모리에 위치
		String str1 = new String("abc");

		// data영역 , static 영역 = constant pool(상수 풀) 영역에 위치
		// 이때까지 사용했던 방식
		String str2 = "abc";

		System.out.println(str1 == str2); // 위치한 영역이 다르기 때문에 같냐고 물으면 false 반환

		System.out.println("===================");

		String str3 = "abc";
		System.out.println(str2 == str3);// 위치한 영역이 같기 때문에 같냐고 물으면 true 반환

		String str4 = new String("abc");
		String str5 = new String("abc");

		System.out.println("===================");
		System.out.println(str4 == str5);// 각각 다른 객체이기 때문에 주소값이 달라 false 반환

		System.out.println("===================");
		String str6 = "abc";
		String str7 = "abc";
		System.out.println(str6 == str7);// true가 나오는데 그 이유는 constant pool 영역에서 같은 문자열이 생성된다면 같은 주소를 바라보게 하기 때문이다.
											// 즉, new를 써서 3개의 객체를 선언했기 때문에 heap에 3개의 주소가 있는 것이지만
											// 상수풀에 생성된 같은 문자열은 같은 주소값을 가지기 때문에 1개의 주소만 있는것이다.
	}// EOM

}// EOC
