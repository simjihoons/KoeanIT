package ch3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("output4.txt")) {

			byte[] bs = new byte[5];
			byte data = 65;

			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;

			}

			fos.write(bs); // 배열 2번째 부터 10개 출력
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("출력이 완료 됨");

	}

}
