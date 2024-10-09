/* print the pattern A B C D 
   B C D E
    C D E F
    D E F G*/


package PatternProgramming;

public class Pattern3 {

	public static void main(String[] args) 
	{
		int row=5;
		int col=5;
		char a='A';
		for( int i=0;i<5 ;i++)
		{
			for( int j=0;j<5;j++)
			{
				System.out.print((char) (a+i+j));
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
