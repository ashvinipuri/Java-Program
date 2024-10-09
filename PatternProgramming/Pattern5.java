/* 
* 
**
***
****
*****
*/



package PatternProgramming;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=1;
		int space=5;
		int star1;
		
		for( int i=0;i<row;i++) // for row
		{
			for( int j=0;j<col;j++) //for column
			{
				for( int k=0;k<space;k++)
				System.out.print("*");
				
			}
			col++;
			System.out.println();
		}
	}

}
