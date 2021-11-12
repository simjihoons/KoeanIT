package ch5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("callback_ex.zip")) {
			FileOutputStream fos = new FileOutputStream("copy.zip");

			// 보조 스트림 사용해보기
			// 인풋 스트림 보조
			BufferedInputStream bis = new BufferedInputStream(fis);

			// 아웃풋 스트림 보조
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			millisecond = System.currentTimeMillis();
			int i;

			// 기반 스트림 사용 코드
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}

			// 보조 스트림 사용 코드 (사용하게 되면 처리속도가 빨라진다.)
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일을 복사 하는데 걸린 시간 : " + millisecond);
	}

}
