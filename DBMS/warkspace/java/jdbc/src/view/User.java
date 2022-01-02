package view;

import dao.TBL_MEMBER_DAO;
import vo.TBL_MEMBER_VO;

public class User {
	public static void main(String[] args) {
		TBL_MEMBER_DAO dao = new TBL_MEMBER_DAO();
		TBL_MEMBER_VO vo = new TBL_MEMBER_VO();

		// 회원가입 ---------------------------------------------------------------
//		vo.setId("hgd1234");
//		vo.setPw("1234");
//		vo.setName("홍길동");
//		vo.setAge(20);
//
//		if (dao.join(vo)) {
//			System.out.println("성공");
//		} else {
//			System.out.println("실패");
//		}
//		

		// 중복검사 ----------------------------------------------------------
//		if(dao.checkId("hgd1234")) {
//			System.out.println("사용가능 한 아이디");
//		}else {
//			System.out.println("중복된 아이디");
//		}
//		
		// 로그인 ------------------------------------------------------------
//		if (dao.login("hgd1234", "1234")) {
//			System.out.println("성공");
//		} else {
//			System.out.println("실패");
//		}
		
		
		// 암호화 -----------------------------------------------------
//		vo.setId("hgd2222");
//		vo.setPw("5555");
//		vo.setName("홍길동");
//		vo.setAge(20);
//
//		if (dao.join(vo)) {
//			System.out.println("성공");
//		} else {
//			System.out.println("실패");
//		}
		
		//5555를 암호화해서 암호화 한것끼리 비교를 하게되니까 로그인성공이나옴
		if (dao.login("hgd2222", "5555")) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
