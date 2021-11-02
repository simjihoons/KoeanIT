package ch2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4 extends JFrame {
	BufferedImage backgroundImage;

	ArrayList<BufferedImage> imageIcon = new ArrayList<BufferedImage>();
	// BufferedImage imageIcon2;
	
	
	
	MyImagePanel myImagePanel;

	public MyFrame4() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.jpg"));
			
			imageIcon.add("among1.jpg");
			//imageIcon2 = ImageIO.read(new File("among2.jpg"));
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}

		// myImagePanel 생성
		myImagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);
	}

	// 내부 클래스
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 80, 80, null);
			g.drawImage(imageIcon2, 100, 100, 80, 80, null);
		}
	}// end of inner class

	// Main
	public static void main(String[] args) {
		new MyFrame4();
	}

}
