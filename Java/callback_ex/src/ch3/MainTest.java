package ch3;

public class MainTest {

	public static void main(String[] args) {
		// 해커 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		SBSNews sbs = new SBSNews();
		
		// 기사 작성
		MyActicle acticle = new MyActicle(hackerNews,sbs);
		acticle.complete();
		
//		MyActicle acticle2 = new MyActicle(sbs);
//		acticle2.complete();
	}

}
