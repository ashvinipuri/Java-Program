/*accept 2 numbers from the user and find the greatest of the numbers*/

package module3;
import java.util.Scanner;
public class IfDemo2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the 2 numbers");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 
		 if((num1>num2) &&(num1>0) &&(num2>0))
	      {
	    	  System.out.println("Number "+num1+"is greater"); //number 1 is greater than number 2
	      }
	      else if(num1<num2)
	      {
	    	  System.out.println("Number "+num2+"is greater"); ////number 2 is greater than number 1
	      }
	      else
	      {
	    	  System.out.println(" enter the number is zero ");
	      }
	}

	}
	


