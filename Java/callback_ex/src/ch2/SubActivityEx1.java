package ch2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class SubActivityEx1 extends JFrame implements ActionListener{
	JButton btnAdd;
	JButton btnMinus;
	JButton btnDivison;
	JButton btnMultiply;

	CallBackBtn2 callBackBtn2;
	
	int num1;
	int num2;
	
	public SubActivityEx1(CallBackBtn2 callBackBtn2 ,int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		
		
		btnAdd = new JButton("더하기");
		btnMinus = new JButton("빼기");
		btnDivison = new JButton("나누기");
		btnMultiply = new JButton("곱하기");
		
		add(btnAdd);
		add(btnMinus);
		add(btnDivison);
		add(btnMultiply);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnDivison.addActionListener(this);
		btnMultiply.addActionListener(this);
		
		this.callBackBtn2 = callBackBtn2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton) e.getSource();
		
		if(targetBtn == btnAdd) {
			callBackBtn2.clickedAddBtn(num1,num2);
		}else if(targetBtn == btnMinus) {
			callBackBtn2.clickedMinusBtn(num1,num2);
		}else if(targetBtn == btnDivison) {
			callBackBtn2.clickedDivisionBtn(num1,num2);
		}else {
			callBackBtn2.clickedMultiplyBtn(num1,num2);
		}
		
	}
}
