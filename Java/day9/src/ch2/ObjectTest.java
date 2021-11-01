package ch2;

// System , String 등을 담고 있으며 선언을 하지 않아도 자동으로 선언된다.

import java.lang.*;

class Student extends Object{

	//toString();
	@Override
	public String toString() {
		
		return "학생클래스";
	}
}

public class ObjectTest extends Object {
	String str1;

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1);
		String str1 = new String("hi");
		System.out.println(str1);
		
	}// EOM

}
