package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7Adapter extends JFrame {

	JTextArea area;
	final int KEY_LEFT = 37;
	final int KEY_UP = 38;
	final int KEY_DOWN = 40;

	public MyFrame7Adapter() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();

	}

	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}

	private void addEventListener() {
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KEY_UP) {
					area.append("위쪽 방향키\n");
				} else if (e.getKeyCode() == KEY_DOWN) {
					area.append("아래쪽 방향키\n");
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 상수 대신 이미 JAVA에서 만들어 놓은것 쓰기
					area.append("왼쪽 방향키\n");
				} else {
					area.append("오른쪽 방향키\n");
				}
			}
		});
	}

}
