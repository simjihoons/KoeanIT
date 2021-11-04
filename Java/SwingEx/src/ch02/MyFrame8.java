package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;

	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.jpg"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);

		}

		// try catch문으로 객체 생성 후
		imagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false); // 마우스로 넓히거나 줄일수 없게
		this.add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
//				if (keyCode == KeyEvent.VK_UP) {
//					yPoint -= (yPoint < 0) ? 0 : 10;
//				} else if (keyCode == KeyEvent.VK_DOWN) {
//					yPoint += (yPoint >= 390) ? 0 : 10;
//				} else if (keyCode == KeyEvent.VK_LEFT) {
//					xPoint -= (xPoint < 0) ? 0 : 10;
//				} else if (keyCode == KeyEvent.VK_RIGHT) {
//					xPoint += (xPoint >= 410) ? 0 : 10;
//				}

				switch (keyCode) {
				case KeyEvent.VK_UP:
					yPoint -= (yPoint < 0) ? 0 : 10;
				case KeyEvent.VK_DOWN:
					yPoint += (yPoint >= 390) ? 0 : 10;
				case KeyEvent.VK_LEFT:
					xPoint -= (xPoint < 0) ? 0 : 10;
				case KeyEvent.VK_RIGHT:
					xPoint += (xPoint >= 410) ? 0 : 10;
				}

				repaint();
			}// end of keyPressed

		});
	}

	// 내부 클래스
	// 그림을 넣을땐 클래스가 따로 필요
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null); // 이미지,x,y,가로크기,세로크기,null
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null); // 방향키 눌렀을때 움직이게 하기위해 변수를 사용
		}
	}

}
