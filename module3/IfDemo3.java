package module3;

import java.util.Scanner;

public class IfDemo3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	 System.out.println("enter the 3 numbers");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		 
		 if((num1>num2) &&(num1>num3))
	      {
	    	  System.out.println("number 1 is greateest among three"); //
	      }
	      else if(num1<num2)
	      {
	    	  System.out.println("number 2 is greatest among three"); ////number 2 is greater than number 1
	      }
	      else
	      {
	    	  System.out.println(" numbers are same ");
	      }
	}

}
