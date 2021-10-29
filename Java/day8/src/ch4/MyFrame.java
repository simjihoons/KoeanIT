package ch4;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("첫번째 GUI 프로그램 작성");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
