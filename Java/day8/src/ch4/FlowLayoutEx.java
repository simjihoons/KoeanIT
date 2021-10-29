package ch4;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;

	private ArrayList<JButton> buttons = new ArrayList<JButton>();
//	  private JButton[] buttons = new JButton[6];

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		// 데이터 초기화
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10)); // 수평,수직

		buttons.add(new JButton("1번재 버튼"));
		buttons.add(new JButton("2번재 버튼"));
		buttons.add(new JButton("3번재 버튼"));
		buttons.add(new JButton("4번재 버튼"));
		buttons.add(new JButton("5번재 버튼"));
		buttons.add(new JButton("6번재 버튼"));

//		buttons[0] = new JButton("1번재 버튼");
//		buttons[1] = new JButton("2번재 버튼");
//		buttons[2] = new JButton("3번재 버튼");
//		buttons[3] = new JButton("4번재 버튼");
//		buttons[4] = new JButton("5번재 버튼");
//		buttons[5] = new JButton("6번재 버튼");
//		for (int i = 0; i < buttons.length; i++) {
//			buttons[i] = new JButton((i+1)+"번째 버튼");
//		}
	}// end of initData

	private void setInitLayout() {
		setVisible(true);
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);
//		add(button6);

		for (int i = 0; i < buttons.size(); i++) {
			JButton a = buttons.get(i);
			add(a);
		}

//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
//		add(buttons[5]);

	}// end of setInitLayout
}

public class FlowLayoutEx {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
