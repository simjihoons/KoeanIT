package ch1;

public class Wrapper_Ex1 {

	public static void main(String[] args) {

		// int -> Integer
		Integer num = new Integer(17); // 박싱
		int n = num.intValue(); // 값을 가져온다. 언박싱
		System.out.println(n);
	}

}
