package ch1;

public class StringTest2 {

	public static void main(String[] args) {
		// 한번 생성된 String은 불변(immutable)
		// String을 연결하면 기존의 String에 연결되는 것이 아닌
		// 새로운 문자열이 생성된다.

		String java = new String("java");
		String android = new String("android");

		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // String의 주소값을 출력할때

		System.out.println("========================");

		// java = java + android;
		java = java.concat(android); // .concat => 문자열 연결
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // 주소 값이 다른것을 확인(기존의 String에 연결되는것이 아닌 새로운 문자열이 생성된 것)
	}

}
