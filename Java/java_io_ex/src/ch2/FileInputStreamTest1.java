package ch2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("assets/input.txt");
//			int first =fis.read();
//			System.out.println(first);

			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일이 없습니다.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("프로그래밍이 종료 되지 않았습니다.");
	}
}
