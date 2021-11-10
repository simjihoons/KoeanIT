package ch4;

public class MainTest {

	public static void main(String[] args) {

		Activity1 activity1 = new Activity1("메인화면");
		Activity2 activity2 = new Activity2("서브화면");

		activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);

	}

}
