package ch3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SBSNews implements WriteArticle{
	
	public String printDate() {
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	
	@Override
	public void printArticle(String article) {
		System.out.println("●●●●SBS News●●●●");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : "+printDate());
		
	}

}
