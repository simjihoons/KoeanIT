package ch04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame implements ActionListener {
	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	CustomJPanel customJPanel; // 내부 클래스 멤버변수

	//
	BorderLayout borderLayout;
	JPanel bottomPanel;
	JButton btnStart;
	JButton btnStop;

	boolean isflag = true;

	// thread 사용할 이미지 좌표
	int among1XPoint = 0;
	int among1YPoint = 370;

	// 키 이벤트 이미지
	int among2XPoint = 200;
	int among2YPoint = 200;

	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();

		// Thread 동작 시작
		Thread thread = new Thread(customJPanel);
		thread.start();

	}

	private void initData() {
		setTitle("AmongUs");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			amongImage1 = ImageIO.read(new File("among1.jpg"));
			amongImage2 = ImageIO.read(new File("among2.png"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}

		customJPanel = new CustomJPanel();
		borderLayout = new BorderLayout();
		bottomPanel = new JPanel();
		btnStart = new JButton("Start");
		btnStop = new JButton("Stop");
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(borderLayout);

		this.add(customJPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);

		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		bottomPanel.add(btnStart);
		bottomPanel.add(btnStop);

	}

	private void addEventListener() {
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();

				switch (code) {
				case KeyEvent.VK_UP:
//					among2YPoint -= (among2YPoint < 0) ? 0 : 10;
					among2YPoint -= 10;
					break;
				case KeyEvent.VK_DOWN:
//					among2YPoint += (among2YPoint >= 390) ? 0 : 10;
					among2YPoint += 10;
					break;
				case KeyEvent.VK_LEFT:
//					among2XPoint -= (among2XPoint < 0) ? 0 : 10;
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT:
//					among2XPoint += (among2XPoint >= 410) ? 0 : 10;
					among2XPoint += 10;
					break;
				}
				repaint();

			}
		});
	}

	// 내부 클래스
	// 그림(이미지) 그리기
	private class CustomJPanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 600, 600, null); // 파일이름,x,y,width,height,null
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);

		}

		@Override
		public void run() {
			boolean isRight = true;

			while (true) {
				if (isflag == true) {

					if (isRight) {
						among1XPoint += 10;
					} else {
						among1XPoint -= 10;
					}

					if (among1XPoint == 400) {
						isRight = false;
					}

					if (among1XPoint == 0) {
						isRight = true;
					}

					// 이미지1과 이미지2가 겹치면(좌표값이 같다면) 이미지1을 null처리
					if (among1XPoint == among2XPoint && among1YPoint == among2YPoint) {
						amongImage2 = null;
					}

					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				repaint();
			}
		}
	}

	// Action Listener
	@Override
	public void actionPerformed(ActionEvent e) {
		// 1. btn이 start? or stop
		JButton clickedButton = (JButton) e.getSource();

		// 2. 변수를 새롭게 활용해서 while을 멈추거나 다시 시작할 수 있게 코드를 수정
		if (clickedButton == btnStart) {
			System.out.println("시작 버튼");
			isflag = true;

		} else {
			System.out.println("종료 버튼");
			isflag = false;
		}
	}
}

public class MainTest1 {

	public static void main(String[] args) {
		new MiniAmongUs();
	}

}
