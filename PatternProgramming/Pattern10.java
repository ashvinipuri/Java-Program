/*
 
    ** 
   *** 
  **** 
 ***** 
*/

package PatternProgramming;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=1;
		int space=5; //or 
		int star=1;  // or
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=row;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=col;k++)
			{
				System.out.print("*");
			}
			row--; // space--
			col++; //star --
			System.out.println(" ");
		}
	}
}


