package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JFrame;

class MyFrame2 extends SuperMyFrame implements ActionListener {

	final int buttonSize = 5;

	ArrayList<JButton> button = new ArrayList<>();

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	@Override
	protected void initData() {
		setTitle("이벤트 리스너 연습2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		for (int i = 0; i < buttonSize; i++) {
			button.add(new JButton("이벤트 버튼" + (i + 1)));
		}

	}

	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());

		for (int i = 0; i < button.size(); i++) {
			add(button.get(i));
		}

	}

	@Override
	protected void addEventListener() {

		for (int i = 0; i < button.size(); i++) {
			button.get(i).addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("버튼이 눌러 졌습니다.");
		JButton clickedButton = (JButton) e.getSource();

		// 버튼 클릭 시 버튼의 텍스트 내용을 String으로 출력
		// System.out.println(clickedButton.getText());

		// 문자열 비교해서
		// 1번 버튼이 클릭 되었습니다.
		// 2번 버튼이 클릭 되었습니다.
		// 출력되게 한다. 단, 버튼이 눌러 졌습니다. println문은 주석 처리

		if (clickedButton.getText().equals(button.get(0).getText())) {
			System.out.println("1번 버튼이 클릭 되었습니다.");
		} else if (clickedButton.getText().equals(button.get(1).getText())) {
			System.out.println("2번 버튼이 클릭 되었습니다.");
		} else if (clickedButton.getText().equals(button.get(2).getText())) {
			System.out.println("3번 버튼이 클릭 되었습니다.");
		} else if (clickedButton.getText().equals(button.get(3).getText())) {
			System.out.println("4번 버튼이 클릭 되었습니다.");
		} else {
			System.out.println("5번 버튼이 클릭 되었습니다.");
		}

	}
}

public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
