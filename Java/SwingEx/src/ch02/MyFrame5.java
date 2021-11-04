package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame {
	JLabel label;

	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}

	protected void initData() {
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("hello java !");
		label.setSize(150, 50);
	}

	protected void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);

		label.setLocation(12, 40);

	}

	private void addEventListener() {

		this.addMouseListener(new MouseListener() {

			// 마우스가 떨어졌을 때(눌렀다가 땠을 때) 실행되는 메서드
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			// 마우스가 눌러졌을때 , 누르고있는동안 실행되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
			}

			// 마우스가 창을 나가면 실행됨
			@Override
			public void mouseExited(MouseEvent e) {

			}

			// 마우스가 창 밖에 있다가 안으로 들어오면 실행됨
			@Override
			public void mouseEntered(MouseEvent e) {

			}

			// 마우스를 한번 클릭했을때 실행
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("X 좌표값 : " + e.getX());
				System.out.println("Y 좌표값 : " + e.getY());
				label.setLocation(e.getX(), e.getY());
			}
		});

	}

	public static void main(String[] args) {
		new MyFrame5();
	}
}
