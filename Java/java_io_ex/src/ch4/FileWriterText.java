package ch4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterText {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			//fw.write('A');
			char[] buf  = {'B','C','D','E','F','X','Y','Z'};
			//fw.write(buf);
			fw.write(buf,1,5);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
