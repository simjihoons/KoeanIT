package ch3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	
	
	BorderLayout borderLayout;
	
	MyImagePanel imagePanel;
	JPanel panel1;
	
	JButton button1;
	JButton button2;

	int xPoint = 200;
	int yPoint = 200;

	public MyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("어몽어스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.jpg"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}

		imagePanel = new MyImagePanel();
		borderLayout = new BorderLayout();
		panel1 = new JPanel();

		button1 = new JButton("그냥 왔다갔다");
		button2 = new JButton("회전하면서 왔다갔다");
	}


	private void setInitLayout() {
		setVisible(true);
		setResizable(false); // 창을 줄이거나 늘릴수 없게하기.
		setLayout(borderLayout);
		add(imagePanel);
		
		
		
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		panel1.setPreferredSize(new Dimension(500, 100));
		add(panel1,BorderLayout.SOUTH);
		panel1.add(button1);
		panel1.add(button2);
		
		
		
	}

	private void addEventListener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();

				switch (keyCode) {
				case KeyEvent.VK_UP:
					yPoint -= (yPoint < 0) ? 0 : 10;
					break;
				case KeyEvent.VK_DOWN:
					yPoint += (yPoint >= 390) ? 0 : 10;
					break;
				case KeyEvent.VK_LEFT:
					xPoint -= (xPoint < 0) ? 0 : 10;
					break;
				case KeyEvent.VK_RIGHT:
					xPoint += (xPoint >= 410) ? 0 : 10;
					break;
				}

				repaint();
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		
		clickedButton.getText().equals(button1);
		
	}

	// 내부 클래스
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 이미지,x,y,가로크기,세로크기,null
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 50, 50, null);

		}
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	
}
