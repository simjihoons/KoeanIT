package ch2;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userInfo1 = new UserInfo("1");
		userInfo1.showInfo();

		UserInfo userInfo2 = new UserInfo("1","p@ssw0rd");
		userInfo2.showInfo();
	}
	//의미없음
}
