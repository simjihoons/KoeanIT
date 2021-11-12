package ch1;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInText2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개 쓰고 Enter를 누르세요");

		int i;
		try {
			// 바이트를 문자로 변경해 주는 녀셕
			// 바이트 단위로 읽은 것을 문자 단위로 읽어 들이게 하는 녀셕
			// --> 보조 스트림
			InputStreamReader irs = new InputStreamReader(System.in);

			while ((i = irs.read()) != '\n') {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
