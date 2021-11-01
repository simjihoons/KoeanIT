package ch3;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	// 멤버 변수
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	private final int MAX_COUNT = 6;

	public GridLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("GirdLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton((i + 1) + ""));
		}
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 3)); // 2행 3열
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
		
			
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
