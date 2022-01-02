package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//한번 만들어 놓고 사용하는 쪽에서 진행하기 위해 코딩
public class DBconnecter {
	public static Connection getConnection() {
		Connection conn = null;

		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "hr";
			String pw = "hr";
			
			//해당 클래스 가져오기(경로)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//conn에다가 DriverManager를 통해서 커넥션을 가져올수 잇음
			conn = DriverManager.getConnection(url,user,pw);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
