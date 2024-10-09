package fileio;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("D:\\Ashvini\\myfile.txt");
		FileOutputStream out= new FileOutputStream("D:\\Ashvini\\Ashvini.txt");
		 // out is object for write file
		 int i;
		 while((i=fr.read()) !=-1)
		 {
			 out.write(i);
		 }
	}

}
