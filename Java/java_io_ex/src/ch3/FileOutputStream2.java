package ch3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output2.txt",true);

		try (fos) { // java 9
			
			byte[] bs = new byte[26];
			byte data = 65;
			
			//A-Z
			for(int i = 0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		}catch(IOException e) {
			
		}
	}

}
