package ch3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainText1 {

	public static void main(String[] args) {
		// Calender 란 날짜 관련 인스턴스
		// 달력 , 시간 계산등을 사용 할 때 많이 사용하는 객체

		// 싱글톤 패턴 = new를 하더라도 실제로 메모리에는 여러개가 아닌 한개가 있음

		Calendar calender = Calendar.getInstance();
		System.out.println(calender.getTimeInMillis()); // 현재 시간 기준으로 ms로 표현

		// 보기 불편하기 때문에 형식을 만들어서 사용할 수 있다.
		// 날짜로 변환 방법 지정
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		
		// 현재 시간을 내가 정한 format 형식으로 변환
		String date = dateFormat.format(calender.getTimeInMillis());
		System.out.println(date);
	}

}
