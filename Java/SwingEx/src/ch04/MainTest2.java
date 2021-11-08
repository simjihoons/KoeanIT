package ch04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame1 extends JFrame {
	public MyFrame1() {
		setTitle("gif 사용해보기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 부모 패널 가져오기
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("비행기 비행");
		ImageIcon img = new ImageIcon("main_img.gif");

		JLabel imgLable = new JLabel(img);
		JLabel bottomTestLabel = new JLabel("한칸 띄우기~~~~");

		c.add(textLabel);
		c.add(imgLable);
		c.add(bottomTestLabel);

		setSize(700, 700);
		setVisible(true);
	}
}

public class MainTest2 {

	public static void main(String[] args) {
		new MyFrame1();

	}

}
