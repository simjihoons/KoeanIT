//dao는 메소드들이 모여있는 컨트롤러 data access object
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.TBL_MEMBER_VO;

public class TBL_MEMBER_DAO {
	// 3개의 메소드에서 공통적으로 쓰는것
	Connection conn; // 커넥션 객체

	// "" 안에 쿼리문을 입력 할것임.
	// select , insert , update , delete ---
	// 쿼리문을 담고 전송을 해주는 역할
	PreparedStatement pstm;

	// 결과 객체를 받을 수 있는 역할
	ResultSet rs;

	private static final int KEY = 3; 
	
	// 중복검사------------------------------------------------------------------------------
	// 사용자가 입력한 아이디를 전달 받는다.
	public boolean checkId(String id) {
		// WHERE ID = "+id => 이런식으로 진행 되는 것이 Statement
		// PreparedStatement 는 변수가 들어갈 자리에 ? 를 써주면 된다.
		// 사용자가 입력한 아이디와 일치하는 개수를 가져온다.
		String query = "SELECT COUNT(ID) FROM TBL_MEMBER WHERE ID = ?";

		// try 문에서 return true등을 하기엔 문제가 생길 수도 있어 방지하기 위해 변수를 만듬
		boolean check = false;

		try {
			// 커넥션 객체 바로 가져오기
			// 드라이버 연결을 통해 커넥션 객체를 가져온다.
			conn = DBconnecter.getConnection();

			// query를 pstm 객체에 담기
			// 입력한 쿼리문을 pstm에 담아준다.
			pstm = conn.prepareStatement(query);

			// query에 대한 ?를 채워주기
			// ? ? => 1 2 순서로 시작하며 두번째 ?에 대한 설정을 하고 싶으면 2라 쓴다.
			pstm.setString(1, id);

			// rs 는 0 또는 1 이다.
			// 쿼리문의 결과를 rs에 담아준다.
			rs = pstm.executeQuery();

			// 행 가져오기
			rs.next();

			// 열 하나만 가져오기 (값이 0 또는 1)
			if (rs.getInt(1) == 0) {
				check = true;
			} // 중복이 없다는 뜻

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return check; // 중복이 있다는 뜻
	}

	// 회원가입-----------------------------------------------------------------------------------------------------------------------
	public boolean join(TBL_MEMBER_VO member) {
		// MEMBER_SEQ.NEXTBAL => 시퀀스를 1씩 증가
		String query = "INSERT INTO TBL_MEMBER" + "(NUM, ID, PW, NAME, AGE)" + "VALUES(MEMBER_SEQ.NEXTVAL,?,?,?,?)";
		boolean check = false;
		try {
			conn = DBconnecter.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, member.getId());
			pstm.setString(2, encrypt(member.getPw()));
			pstm.setString(3, member.getName());
			pstm.setInt(4, member.getAge());
			if (pstm.executeUpdate() == 1) {
				check = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return check;
	}

	// 로그인-----------------------------------------------------------------------------------------------------
	public boolean login(String id, String pw) {
		String query = "SELECT * FROM TBL_MEMBER WHERE ID = ? AND  PW = ?";
//				"SELECT COUNT(ID) FROM TBL_MEMBER"
//				+"WHERE ID = ? AND PW = ?";

		boolean check = false;
		try {
			conn = DBconnecter.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			pstm.setString(2, encrypt(pw));
			rs = pstm.executeQuery();

			rs.next();
			if (rs.getInt(1) == 1) {
				check = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

		return check;
	}

	// 단방향 암호화
	public String encrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw  += (char)(pw.charAt(i) + KEY);
		}
		
//		String en_pw = "";
//		for(int i=0; i<pw.length(); i++) {
//			en_pw += (char)(pw.charAt(i) + 5);
//		}
//		return en_pw;
		
		return en_pw;
	}

}
