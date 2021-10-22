package ch2;

public class UserInfo {
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;

	// 생성자 오버로딩
	// 이름은 같으나 전달받는 값으로 구분함.
	//의미없음
	public UserInfo() {
	}

	public UserInfo(String userId) {
		this.userId = userId;
	}

	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}

	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}

	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}

	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;

	}

	public void showInfo() {
		System.out.println("userId : " + userId + "\nuserPassWord: " + userPassWord + "\nuserName : " + userName
				+ "\nuserAddress : " + userAddress + "\nphoneNumber : " + phoneNumber);
	}

}
