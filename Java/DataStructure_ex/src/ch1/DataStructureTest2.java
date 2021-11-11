package ch1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest2 {

	public static void main(String[] args) {
		Set set;

		// 중복할수 없고, 순서가 없다.
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("set1 : " + set1); // 중복 값은 덮어쓰기가 된다.
		System.out.println("set1 size : " + set1.size());

		// 삭제
		set1.remove(1);
		System.out.println(set1);

		// while문 사용
		// 요소 순회 반복자
		Iterator<Integer> iter = set1.iterator();

		while (iter.hasNext()) {
			System.out.println("값 확인 : " + iter.next());
		}

		HashSet<Integer> set2 = new HashSet<>();

//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());

		while (true) {
			if (set2.size() > 5)
				break;
			set2.add(getRandomNumber());
		}
		System.out.println(set2);
		
	}// end of main
	

	public static int getRandomNumber() {
		Random random = new Random();
		int value = random.nextInt(45) + 1;
		return value;
	}

}
