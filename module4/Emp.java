package module4;

import java.util.Scanner;

public class Emp 
{
private int empNo;
private String name;
private double bal;
Scanner sc=new Scanner(System.in); //2nd step
public void accept()
{
	  System.out.println("enter the empNo");
	   empNo=sc.nextInt();
	   System.out.println("enter the employee name");
	   name=sc.next();
	   System.out.println("enter the employee bal");
	   bal=sc.nextInt();
}
//member functions
 public void checkEmpNo()
 {
	 if(empNo>0)
	System.out.println("valid employee number");
	 else
		 System.out.println("Invalid employee number");
 }

  public void checkBal()
  {
	  if(bal>0 && bal<100000)
		  System.out.println("valid balance");
	  else
		  System.out.println("produce the proof");
 }
  
  
  public void display()
  {
 	System.out.println("empNo="+empNo);
 	System.out.println("name="+name);  
 	System.out.println(" Bal="+bal); 
  }

}

