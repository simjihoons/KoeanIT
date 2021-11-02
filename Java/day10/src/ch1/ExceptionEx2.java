package ch1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		FileInputStream fls;

		try {
			fls = new FileInputStream("a.txt");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("파일없음");
		}catch(Exception e) {
			System.out.println("예외처리");
			return; //심지어 리턴문이 있어도  finally가 실행된다.
		}finally {
			// try문이 실행되면 반드시 실행됨
			System.out.println("hi");
		}
		
		System.out.println("비정상 종료");
	}

}
