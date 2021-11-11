package ch2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {

	// 삽입
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;

		String name, address, telephone;

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 >> : ");
		name = sc.next();

		System.out.println("주소 >> : ");
		address = sc.next();

		System.out.println("전화번호 >> : ");
		telephone = sc.next();

		phone = new Phone(name, address, telephone);

		map.put(phone.name, phone);
	}

	// 삭제
	public static void delete(HashMap<String, Phone> map) {
		// key는 이름을 입력 받아서 사용
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 정보 : ");
		key = sc.next();

		if (map.containsKey(key)) {
			map.remove(key);
		} else {
			System.out.println(key + "는 등록되지 않은 이름 입니다.");
		}

	}

	// 찾기
	public static void search(HashMap<String, Phone> map) {
		// key 이름을 입력 받아서 찾아서 화면에 출력
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 할 정보 : ");
		key = sc.next();

		if (map.containsKey(key)) {
			System.out.println("이름 : " + map.get(key).name + "\n주소 : " + map.get(key).address + "\n전화번호 : "
					+ map.get(key).telephone);
		} else {
			System.out.println("등록된 이름이 없습니다.");
		}

	}

	// 전체 보기
	public static void showInfo(HashMap<String, Phone> map) {
		// 화면에 전체기능 뿌려주는 기능
		// 방법 1
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephone);

		}

		// 방법 2
//		for (Entry<String, Phone> entry : map.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + "\n주소 : " + entry.getValue().address + "\n전화번호 : "
//					+ entry.getValue().telephone);
//		}
	}

	public static void main(String[] args) {
		HashMap<String, Phone> map = new HashMap<>();

		// 메서드 사용
//		insert(map);
//		insert(map);
//		insert(map);

//		System.out.println(map);

		// delete(map);
//		System.out.println(map);

		// search(map);
		// showInfo(map);

		// 실행의 흐름 만들어 보기
		int menu;
		boolean isFalg = true;
		Scanner sc = new Scanner(System.in);

		while (isFalg) {
			System.out.println("----------------");
			System.out.println("전화번호 관리 프로그램");
			System.out.println("----------------");
			System.out.println("추가 0 ,삭제 1, 찾기 2,전체보기 3, 종료 4");
			menu = sc.nextInt();

			switch (menu) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				isFalg = false;
				break;
			default:
				break;

			}
		}
	}

}
