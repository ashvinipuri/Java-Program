package module3;

import java.util.Scanner;

public class IfDemo5
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the  numbers");
		 int num=sc.nextInt();
		 if(num>0)
		 {
			 int remainder=num%10;
			 int quotient=num/10;
			 System.out.println("power is"+Math.pow(remainder, num));
		 }
	}

}
