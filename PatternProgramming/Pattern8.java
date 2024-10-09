/*
 1
 2 3
3 4 5
4 5 6 7  
5 6 7 8 9
 */




package PatternProgramming;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=9;
		int col=1;
		for( int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				
				System.out.print(j+1);
				
			}
			col++;
			System.out.println();
	}
	}
}
