package ch1;

import java.util.Calendar;

public class MainTest {

	public static void main(String[] args) {
		// company 객체 생성 5개
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		Company com3 = Company.getInstance();
		Company com4 = Company.getInstance();
		Company com5 = Company.getInstance();
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		System.out.println(com4);
		System.out.println(com5);
		
		
		Calendar c =  Calendar.getInstance();
		System.out.println(c);
		
	}

}
