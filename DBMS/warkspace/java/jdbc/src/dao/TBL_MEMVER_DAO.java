//dao는 메소드들이 모여있는 컨트롤러 data access object
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TBL_MEMVER_DAO {
	//3개의 메소드에서 공통적으로 쓰는것
	Connection conn; // 커넥션 객체
	
	// "" 안에 쿼리문을 입력 할것임.
	// select , insert , update , delete ---
	// 쿼리문을 담고 전송을 해주는 역할
	PreparedStatement pstm;
	
	// 결과 객체를 받을 수 있는 역할
	ResultSet rs;
	
	//중복검사
	//사용자가 입력한 아이디를 전달 받는다.
	public boolean checkId(String id) {
		//WHERE ID = "+id => 이런식으로 진행 되는 것이 Statement 
		//PreparedStatement 는 변수가 들어갈 자리에 ? 를 써주면 된다.
		String query = "SELECT COUNT(ID) FROM TBL_MEMBER WHERE ID = ?";
		
		//try 문에서 return true등을 하기엔 문제가 생길 수도 있어 방지하기 위해 변수를 만듬
		boolean check = false;
		
		try {
			//커넥션 객체 바로 가져오기
			conn = DBconnecter.getConnection();
			
			//query를 pstm 객체에 담기
			pstm = conn.prepareStatement(query);
			
			//query에 대한 ?를 채워주기
			// ? ? => 1 2 순서로 시작하며 두번째 ?에 대한 설정을 하고 싶으면 2라 쓴다.
			pstm.setString(1, id);
			
			//rs 는 0 또는 1 이다.
			rs = pstm.executeQuery();
			
			 // 행 가져오기
			rs.next();
			
			 // 열 하나만 가져오기 (값이 0  또는 1)
			if(rs.getInt(1)==0) {check = true;} // 중복이 없다는 뜻
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check; // 중복이 있다는 뜻
	}
	//회원가입
	//로그인
	
}
