/*  accept  a number from the user and check where the number is 1 digit,2 digit,3 digit*/

package module3;
import java.util.Scanner;
public class IfDemo4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the 3 numbers");
		 int num=sc.nextInt();
		 
		 
		 if((num>=0) &&(num<10))
		 {
			 System.out.println("num is one digit number");
	      }
		 else if(num>=10 && num<100)
		 {
			 System.out.println("num is two digit number");
		 }
		 else if(num>=100 && num<1000)
		 {
			 System.out.println("num is three digit number");
		 }
		 else if(num>=1000 && num<10000)
		 {
			 System.out.println("num is four digit number");
		 }
}
}