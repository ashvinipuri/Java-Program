package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo1 {

	public static void main(String[] args)  
	{
		 
				try {
				FileInputStream fis = new FileInputStream("D:\\Ashvini\\myfile.txt");
				int k;
				while ((k = fis.read()) != -1) {
					System.out.print((char) k);
				}
				fis.close();
			}catch(IOException e)
				{
				System.out.println("Error: path is wrong for the file,check the path...");
				System.out.println(e.getMessage());
				}
			}
		}
	


