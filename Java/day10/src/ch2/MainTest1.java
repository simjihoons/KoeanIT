package ch2;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		Mycomponents2 mc = new Mycomponents2();
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("글자를 입력 : ");
		
		
		String userInput = sc.nextLine();
	    
	
		mc.textField.setText(userInput);
		
	}	

}
