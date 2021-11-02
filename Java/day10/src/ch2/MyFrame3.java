package ch2;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	private Image image;

	public ImagePanel(String imagName) {
		// image2 = new ImageIcon(imagName).getImage();
		image = new ImageIcon(imagName).getImage();
	}

	public ImagePanel() {
		image = new ImageIcon("image.jpg").getImage();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}

////////////////////////////////////////////////////////////
public class MyFrame3 extends JFrame {
	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;

	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Jpanel에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel2 = new ImagePanel("image2.jpg");

		button = new JButton("버튼입니다.");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		add(imagePanel);
		add(imagePanel2);

		imagePanel.add(button);
	}

	public static void main(String[] args) {
		new MyFrame3();
	}
}
