package fileio;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		File file =new File ("D:\\Ashvini\\myfile.txt");
		
		FileReader fr =new FileReader(file);
		BufferedReader  br= new  BufferedReader(fr,200);
		// 200:number of ch to read                obj
		String str;
		while((str=br.readLine()) !=null)
		{ //readline means it will read entire line
			// to read a line : 200 char
			System.out.println(str);
		}
		
	}

}
