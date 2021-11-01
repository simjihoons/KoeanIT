package ch3;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	BorderLayout borderLayout; // 변수 선언

	JButton[] buttons = new JButton[5];
	String[] titles = { "북", "센터", "남", "동", "서" };
	String[] directions = { BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.EAST,
			BorderLayout.WEST };

	public BorderLayoutEx() {
		iniData();
		setInitLayout();
	}

	private void iniData() {
		// JFrame
		super.setTitle("BorderLayout 연습");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 400);

		borderLayout = new BorderLayout();

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}

	private void setInitLayout() {
		setVisible(true);
//			super.add(buttons[0],BorderLayout.NORTH);
//			super.add(buttons[1],BorderLayout.CENTER);
//			super.add(buttons[2],BorderLayout.SOUTH);
//			super.add(buttons[3],BorderLayout.EAST);
//			super.add(buttons[4],BorderLayout.WEST);

		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i]);
		}
	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
