/* 
 1
1 2
1 2 3
1 2 3 4
1 2 3 4 5  */




package PatternProgramming;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=1;
		for( int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				
				System.out.print(j+1);
				System.out.print(" ");
			}
			col++;
			System.out.println();
	}
	}
}
