package PatternProgramming;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=5;
		int space=5;
		int star=1;
		for( int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				for( int k=0;k<space;k++)
				{
					System.out.print(" ");
				}
					for( int l=0;l<star;l++)
					{
						System.out.print("*");
				}
				space--;
				star++;
				System.out.print( " ");
				
				
			}
			
			System.out.println();
	}
	}

}
