package ch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {

			byte[] bs = new byte[22];
			int i;

			while ((i = fis.read(bs)) != -1) {
				for(int j = 0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"byte 읽음");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일없음");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("이문제");
		}
	}

}
