package ch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
//		try {
//			
//		} catch (Exception e) {
//
//		}

		// trc catch 리소스
		// 자바 jdk 9버전 이후부터 사용 가능
		// 자동으로 close 까지 해준다.
		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {
			int i;

			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
