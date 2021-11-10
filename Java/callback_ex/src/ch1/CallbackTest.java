package ch1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// callback 메서드 만들기
// 안드로이드 , 스프링 등에서 많이 쓰임!
// 1. 인터페이스 선언(추상메서드만 존재해야 한다.)
interface CallbackBtnAction {
	public abstract void clickedAddBtn();

	public abstract void clickedSubtractBtn();

	public abstract void showName();

	public abstract void showAge();

	public abstract void showAddress();

	// 매개 변수로 값 전달 가능
	public abstract void passValue(int value);

}// end of interface

//콜백 받는 객체 :CallbackBtnAction 인터페이스를 구현해서 메서드를 정의 한다.
class MainActivity extends JFrame implements CallbackBtnAction {
	int count;
	String name;
	int age;
	String address;

	JLabel label;

	public MainActivity() {
		count = 0;
		this.name = "홍길동";
		this.age = 20;
		this.address = "부산";

		label = new JLabel(count + "");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(label);

	}

	@Override
	public void clickedAddBtn() {
		// 콜백되어지는 메서드 :
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");

	}

	@Override
	public void clickedSubtractBtn() {
		count--;
		label.setText(count + "");

	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		label.setText(name);

	}

	@Override
	public void showAge() {
		// TODO Auto-generated method stub
		label.setText(age + "");
	}

	@Override
	public void showAddress() {
		// TODO Auto-generated method stub
		label.setText(address);
	}

	@Override
	public void passValue(int value) {
		// TODO Auto-generated method stub
		System.out.println("value : " + value);
		label.setText(value + "");
	}

}// end of mainactivity

// 콜리 (호출자) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener {
	JButton btnAdd;
	JButton btnSubtract;

	// 문제1. 버튼3개 생성
	JButton btn1;
	JButton btn2;
	JButton btn3;

	JButton btnPassValue;

	// 멤버 변수로 선언을 해준다.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요!!!
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

		btnAdd = new JButton("더하기 버튼");
		add(btnAdd);

		btnSubtract = new JButton("뺴기 버튼");
		add(btnSubtract);

		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);

		btn1 = new JButton("이름");
		btn2 = new JButton("나이");
		btn3 = new JButton("주소");
		btnPassValue = new JButton("값 전달 버튼");

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btnPassValue.addActionListener(this);

		add(btn1);
		add(btn2);
		add(btn3);
		add(btnPassValue);

		this.callbackBtnAction = callbackBtnAction;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton) e.getSource();

		if (targetBtn == btnAdd) {
			callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnSubtract) {
			callbackBtnAction.clickedSubtractBtn();
		} else if (targetBtn == btn1) {
			callbackBtnAction.showName();
		} else if (targetBtn == btn2) {
			callbackBtnAction.showAge();
		} else if (targetBtn == btn3) {
			callbackBtnAction.showAddress();
		} else {
			callbackBtnAction.passValue(10);
		}

	}
}// end of SubActivity

public class CallbackTest {

	public static void main(String[] args) {
		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);
	}

}
