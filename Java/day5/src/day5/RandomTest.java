package day5;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// JDK에서 만들어준 도구
		// 1. 랜덤
		Random r = new Random();
		int value =  r.nextInt(20);
		System.out.println(value);
	}

}
