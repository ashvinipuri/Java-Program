package fileio;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		 FileReader fr= new FileReader("D:\\Ashvini\\myfile.txt");
		 int i;
		 while((i=fr.read()) !=-1)
		 {
			 System.out.print((char) i);
		 }
	}

}
