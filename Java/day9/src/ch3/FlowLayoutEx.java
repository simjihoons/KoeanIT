package ch3;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	final int BUTTONS_COUNT = 16;
//  기본 방식	
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;

	
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	
//	  private JButton[] buttons = new JButton[6];
	

	// 문제 해결 능력 C R U D
	// 분할앤정복방식
	// 1.생성방법
	// 2.추가하는방법
	// 3.값을 출력하는 방법
	
	

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

		// ArrayList 이용
//		buttons.add(new JButton("1번째 버튼"));

		// ArrayList, for 이용
		// ArrayList는 처음 size()는 0이다.
		for (int i = 0; i <BUTTONS_COUNT; i++) {
			buttons.add(new JButton((i + 1) + "번째 버튼"));
		}

//		배열을 사용하는 방법(기본 과 for문 이용)		
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
//      기본 방식		
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);
//		add(button6);

//		배열 이용		
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
//		add(buttons[5]);

		// ArrayList, for 이용
		for (int i = 0; i < buttons.size(); i++) {
		// JButton a =buttons.get(i);
			add(buttons.get(i));
		}

	}// end of setInitLayout
}

public class FlowLayoutEx {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
