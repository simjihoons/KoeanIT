package ch1;

public class BookMainTest {

	public static void main(String[] args) {
		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// 배열을 이용해서 shoppingCart 변수(배열)에 객체를 담아 봅시다.
		Book[] shoppingCart = new Book[5];

		// 사고싶은 책을 장바구니에 담에 봅시다 3개만
		shoppingCart[0] = book2;
		shoppingCart[1] = book5;
		shoppingCart[2] = book3;

		// 장바구니에 담은 정보를 화면에 출력하세요
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
				System.out.println("================");
			}
		}

		// 4 수정할때
		shoppingCart[0] = book5;

		// 5 인덱스 1번째에 book1을 추가 1번째에 book3 2번째에 book5 3번째에 book3 ---
		shoppingCart[0] = book2;
		shoppingCart[1] = book1;
		shoppingCart[2] = book5;
		shoppingCart[3] = book3;
		
		// 삭제 (3번째 인덱스 삭제)
		shoppingCart[3] = null;

	}// EOM

}
