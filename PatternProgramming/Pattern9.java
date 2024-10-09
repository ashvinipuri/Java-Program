/*
 1 
0 0 
1 1 1 
0 0 0 0 
1 1 1 1 1 
*/




package PatternProgramming;

public class Pattern9 {

	public static void main(String[] args) {
		int row=5;
		int col=1;
		for( int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				
				System.out.print((i+1)%2); //  or (i%2)
				System.out.print(" ");
			}
			col++;
			System.out.println();
		}
	}
}
