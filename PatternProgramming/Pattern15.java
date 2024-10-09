/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/



package PatternProgramming;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;                         // int s=5;
		int col=5;                         // for( int i=0;i<5;i++)
		for( int i=5;i>=0;i--)             //
			                               //
		{
			for( int j=0;j<col;j++)
			{
				System.out.print(i);
			}
			col--;
			System.out.println();
	}
	}

}
