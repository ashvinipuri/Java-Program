/*
 
*****
****
***
**
*


*/

package PatternProgramming;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=5;
		int col=5;
		for( int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				System.out.print("*");
			}
			col--;
			System.out.println();
	}
	}
}
