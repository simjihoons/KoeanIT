package ch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("assets/input1.txt")){
			
			byte[] bs = new byte[10];
			
			fis.read(bs,0,5); // 0부터 5개씩 읽음
			
			for (byte b : bs) {
				System.out.print((char)b);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 없음");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
