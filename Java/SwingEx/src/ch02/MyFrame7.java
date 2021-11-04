package ch02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame implements KeyListener {

	JTextArea area;
	final int KEY_LEFT = 37;
	final int KEY_UP = 38;
	final int KEY_DOWN = 40;

	public MyFrame7() {
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
		area.addKeyListener(this);
	}

	// 문자를 눌렀을때 호출, 문자키에만 반응
	// 키 다운도 가능하다
	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped : " + e.getID());
	}

	// 키보드를 눌렀을때 호출, 모든 키에 반응
	// 키 다운도 가능하다
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " + e.getID());

		// getKeyCode() => 키보드의 숫자값을 알려줌
//		System.out.println(e.getKeyCode());

		// 키보드를 입력했을때 문자열이 그자리에서 계속 덮어씌어짐
		// getKeyCode()의 리턴값이 int기 때문에 간단하게 문자열로 바꾸기 위해 + 연산자를 이용한다.
//		area.setText(e.getKeyCode()+"");

		// 키보드를 입력했을때 문자열이 오른쪽으로 진행됨
//		area.append(e.getKeyCode()+"\n");

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

	// 키보드를 땟을때 호출, 모든 키에 반응
	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased : " + e.getID());
	}

}
