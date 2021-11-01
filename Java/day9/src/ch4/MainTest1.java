package ch4;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		MyComponents mc = new MyComponents();
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("글자를 입력 : ");
		
		
		String userInput = sc.nextLine();
	    
	
		mc.textField.setText(userInput);
		
	}	

}
