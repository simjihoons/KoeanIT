package ch2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("assets/input1.txt");
			int i;

			// while문으로 처리
			// fis.read() --> -1

			while ((i= fis.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
