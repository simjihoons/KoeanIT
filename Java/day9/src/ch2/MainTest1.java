package ch2;

public class MainTest1 {

	public static void main(String[] args) {
		Book book1 = new Book(1,"데미안","헤드만 헤세");
		Book book2 = new Book(1,"데미안","헤드만 헤세");
		System.out.println(book1 == book2);
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
		
		System.out.println("====================");
		boolean result = "a".equals("a");
		System.out.println(result);
		System.out.println("a"=="a");
		
		System.out.println("====================");
		
		//equals 메서드 재정의 후 사용
		//다른 객체이지만 책이름이 같으면 같은 책이라고 반환(논리적으로 설계)
		//equals는 실제로 객체의 주소값을 비교한다.
		if(book1.equals(book2)) {
			System.out.println("같은 책");
		}else {
			System.out.println("다른 책");
		}
	}

}
