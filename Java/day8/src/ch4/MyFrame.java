package ch4;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("첫번째 GUI 프로그램 작성"); // 창의 타이틀 바 
		setSize(400, 400); // 창 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x를 눌러 종료 시 프로세스 까지 종료
		setVisible(true); //창을 화면에 나타낼것인지 설정

	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
