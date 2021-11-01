package ch1;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer 활용
		// 내부적으로 가변적인 char[]를 멤버 변수로 가짐.
		// 문자열을 여러번 연결하거나 변경할 때 사용하면 유용하다.
		// StringBuffer : 멀티 쓰레드 프로그래밍에서 동기화를 보장
		// StringBuilder: 단일 쓰레드 프로그램에서 사용하는것을 권장
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		System.out.println("=====================");
		builder.append(android); // 문자열 더하기
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder)); 
		
		//문제 1 append 메서드 사용하여 3개(주소값 확인)
		builder.append("frist");
		builder.append("second");
		builder.append("third");
		System.out.println("=====================");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder)); 
		
		//문제2 
		String tempStr = builder.toString();
		System.out.println(tempStr);
	}

}
