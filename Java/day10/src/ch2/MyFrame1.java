package ch2;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	public MyFrame1() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPanel = new MyPanel();

	}

	public void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}

	// 내부 클래스 , static(정적 내부 클래스) , 앞에 static이 없다면 (인스턴스 , 내부클래스)
	static class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);

//			g.drawString("안녕하세요",10,20);
//			g.drawLine(20,30,100,100);

//			g.drawString("★", 50, 100);
//			g.drawString("★", 20, 180);
//			g.drawString("★", 30, 50);
//			g.drawString("★", 50, 100);
//			g.drawString("★", 50, 100);
//			g.drawLine(175, 5, 100, 100);
//			g.drawLine(175, 5, 250, 100);
//			g.drawRect(100, 100, 150, 150);
//			g.drawRect(114, 131, 50, 50);
//			g.drawLine(140, 130, 140, 182);
//			g.drawLine(115, 156, 163, 156);
//			g.drawRect(180, 189, 38, 61);
//			g.drawString("●", 210, 220);
			g.drawLine(300,100,200,200);
			g.drawRect(200, 200, 200, 200);
			g.drawLine(300,100,400,200);
			
		}
	}
	public static void main(String[] args) {
		new MyFrame1();
	}
}
