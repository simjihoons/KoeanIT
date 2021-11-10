package ch3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



//콜백 받음
public class HackerNews implements WriteArticle {
	// 현재 날짜를 찍어줌
	private String printDate() {
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}

	@Override
	public void printArticle(String article) {
		System.out.println("***Hacker News***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : "+printDate());
	}
}
