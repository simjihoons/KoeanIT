package ch3;

import java.util.Scanner;

//콜리 (호출자)
public class MyActicle {
	String article;
	WriteArticle hacker;
	WriteArticle sbs;

	// 주소값 연결
	public MyActicle(WriteArticle hacker,WriteArticle sbs) {
		
		this.hacker = hacker;
		this.sbs = sbs;
	}

	public void complete() {
		// 스캐너를 이용 , 입력값 받고 콜백 메서드 실행
		Scanner sc = new Scanner(System.in);
		System.out.println("기사 작성");
		article = sc.nextLine();
		
		hacker.printArticle(article);
		sbs.printArticle(article);
		
	}
}
