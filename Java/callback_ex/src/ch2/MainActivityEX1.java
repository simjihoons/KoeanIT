package ch2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivityEX1 extends JFrame implements CallBackBtn2{
	
	JLabel label;
	
	public MainActivityEX1() {
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		label = new JLabel();
		add(label);
	}
	
	
	
	@Override
	public void clickedAddBtn(int num1 , int num2) {
	
		label.setText((num1+num2)+"");
	}

	@Override
	public void clickedMinusBtn(int num1 , int num2) {
	
		label.setText((num1-num2)+"");
	}

	@Override
	public void clickedDivisionBtn(int num1 , int num2) {
		
			
		label.setText(((double)num1/num2)+"");
	}

	@Override
	public void clickedMultiplyBtn(int num1 , int num2) {
		
		label.setText((num1*num2)+"");
	}

}
