package ch2;

import java.util.ArrayList;

import ch1.Book;

public class ArrayListMainTest1 {

	public static void main(String[] args) {
		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// ArrayList 선언
		// 데이터를 담을 공간 만들기
		// ! ArrayList는 배열과 달리 공가의 크기를 먼저 선언할 필요가 없다.
		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		// 데이터 추가
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		shoppingCart.add(book4);

		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("================================");
		
		// 데이터 추가2
		shoppingCart.add(2, book5);

		// 향상된 for문
		for (Book book : shoppingCart) {
			book.showInfo();
		}

		System.out.println("=================================");

		// 삭제
		shoppingCart.remove(4);

		for (Book book : shoppingCart) {
			book.showInfo();
		}

		
		// 값 전부 삭제
		//shoppingCart.clear();
		
		
		System.out.println("=================================");
		
		// 값 수정
		shoppingCart.set(0, book2);
		for(Book book : shoppingCart) {
			book.showInfo();
		}
		
		//CRUD
		// C - create
		// R - read
		// U - Update
		// D - delete
	}

}
