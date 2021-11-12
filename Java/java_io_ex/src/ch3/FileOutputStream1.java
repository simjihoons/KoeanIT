package ch3;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) {
		
		//없으면 파일을 만들어준다.
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
