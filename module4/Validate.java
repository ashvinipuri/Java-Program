package module4;

import java.util.Scanner;

public class Validate
{
private int age;
private int income;

Scanner sc=new Scanner(System.in); //2nd step
public void accept()
{
	
	System.out.println("enter the person age");
	age=sc.nextInt();
	System.out.println("enter the person income");
	income=sc.nextInt();
}
	public void checkAge()
	{
	if	(age>=18 && age<=60 )
	{
	System.out.println("valid age");	}
 else
	System.out.println(" not valid age");	
	}
	
	public void checkIncome()
	{
	if(income>25000)
	{
	System.out.println("eligible for loan");
	}
	else
	System.out.println(" not eligible for loan");	
	}
	
	 public void display()
	  {
	 	System.out.println("Age="+age);
	 	System.out.println("income="+income); 
	  }
}
	
