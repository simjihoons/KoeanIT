package ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int grade;
}

public class DataStructureTest1 {

	public static void main(String[] args) {
		// list
		List list0;

		// 순서(인덱스)가 있고 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> member = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();

		// 선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

		// 값 추가 방법
		list.add(3); // 인덱스0번째에 값 3
		list.add(null); // 인덱스 1번째에 값 null
		list.add(1, 10); // 인덱스 1번째에 값을 10을 삽입 null은 인덱스2번째로 밀려난다.

		// 값 확인 (toString 메서드가 재 정의되어 주소값이 아닌 값이 출력된다.)
		System.out.println("값 확인 : " + list);

		// 값 삭제 방법1
		list.remove(2); // 인덱스 2번째 값 삭제
		System.out.println("값 삭제 방법 : " + list);
		// 값 삭제 방법 2
		// list.clear(); // 전체 값 삭제

		System.out.println("값 출력 방법 : " + list.get(1));

		for (Integer i : list) {
			System.out.println("for 사용 방법 : " + i);
		}

		// while 이용
		// 요소 순회(반복자) - 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
		Iterator<Integer> iter = list.iterator();

		while (iter.hasNext()) {// hasNext() => 요소가 없을때까지 반복
			System.out.println("while 사용 방법 : " + iter.next());

		}

		// 값 검색 방법
		// ..contains()
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));

		// 값이 있으면 인덱스 번호 반환 , 없으면 -1 반환
		// .indexOf()
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(1));
		System.out.println(list.indexOf(3));

		// 문제 1
		ArrayList<String> names = new ArrayList();

		// 스캐너 사용
		Scanner sc = new Scanner(System.in);

		// 이름을 입력하면 names 리스트에 저장 while
		// 0번 누르면 종료, 종료시 입력한 이름을 출력

		while (true) {
			System.out.println("이름 입력을 입력하세요 \n종료 : 0번");
			String name = sc.nextLine();
			if (name.equals("0")) {
				break;
			}
			names.add(name);
		}

		Iterator<String> iter2 = names.iterator();
		while (iter2.hasNext()) {
			System.out.println("값 출력 : " + iter2.next());
		}

	}

}
