package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyFrame implements ActionListener {
	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
		
	Scanner sc = new Scanner(System.in);
	ArrayList<JButton> button = new ArrayList<>();
	//String name = "";

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	@Override
	protected void initData() {
		super.initData();
		setTitle("이벤트 리스너 연습3");
		setSize(500, 500);
		borderLayout = new BorderLayout();
		panel1 = new JPanel();
		panel2 = new JPanel();
		

		for (int i = 0; i < 7; i++) {
			button.add(new JButton(sc.nextLine()));
		}

	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		setLayout(borderLayout);

		// 패널 배경색 설정
		panel1.setBackground(Color.gray);
		// 패널 크기 설정
		panel1.setPreferredSize(new Dimension(500, 400));
		// BorderLayout은 add할때 위치도 정해줘야함
		add(panel1, BorderLayout.NORTH);

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);

		
		for (int i = 0; i < button.size(); i++) {
			panel2.add(button.get(i));
		}

	}

	@Override
	protected void addEventListener() {
		super.addEventListener();
		
		for (int i = 0; i < button.size(); i++) {
			button.get(i).addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1 버튼이 눌러지면 panel1 색 변경
		// 2 버튼이 눌러지면 panel1 색 변경
		JButton clickedButton = (JButton) e.getSource();

		if (clickedButton.getText().equals(button.get(0).getText())) {
			panel1.setBackground(Color.RED);
		} else if (clickedButton.getText().equals(button.get(1).getText())) {
			panel1.setBackground(Color.ORANGE);
		} else if (clickedButton.getText().equals(button.get(2).getText())) {
			panel1.setBackground(Color.YELLOW);
		} else if (clickedButton.getText().equals(button.get(3).getText())) {
			panel1.setBackground(Color.GREEN);
		} else if (clickedButton.getText().equals(button.get(4).getText())) {
			panel1.setBackground(Color.BLUE);
		} else if (clickedButton.getText().equals(button.get(5).getText())) {
			panel1.setBackground(Color.PINK);
		} else {
			panel1.setBackground(Color.BLACK);
		}

	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}
}
