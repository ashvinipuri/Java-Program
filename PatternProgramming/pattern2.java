/* print the pattern
 * 1 2 3 4
   1 2 3 4
   1 2 3 4
   1 2 3 4
   1 2 3 4*/

package PatternProgramming;

public class pattern2 
{

	public static void main(String[] args) 
	{
		int row=5;
		int col=5;
		for( int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				System.out.print(j+1);
				System.out.print(" ");
			}
			System.out.println(" ");
		}


	}

}
