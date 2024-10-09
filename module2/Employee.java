/*private int empno
 private string name
 private double empsalary
 
public void accept()
public void dispaly()
public void completeProject()
public void checkAttendence()
public void applyLoan()
 */



package module2;

import java.util.Scanner;

public class Employee 
{

	private  int empNo;
	private String ename;
	private double empsalary;
   
   Scanner sc=new Scanner(System.in); //2nd step
   public void accept()
   {
	  System.out.println("enter the empNo");
	   empNo=sc.nextInt();
	   System.out.println("enter the employee name");
	   ename=sc.next();
	   System.out.println("enter the employee salary");
	   empsalary=sc.nextInt();
   }
 //member functions
    public void comleteProject()
    {
   	System.out.println("comleting the project");
    }

     public void checkAttendence()
     {
   	  System.out.println("checking assignment");  
    }
     
     public void applyLoan()
     {
   	  System.out.println("applying for Loan");
     }
     public void display()
     {
    	System.out.println("empNo="+empNo);
    	System.out.println("ename="+ename);  
    	System.out.println("empsalary="+empsalary); 
     }

}

