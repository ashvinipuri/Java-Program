package module4;
import java.util.Scanner;
public class User 
{
	private String name;
	private int age;
	 private double sal;
	 Scanner sc=new Scanner(System.in);
	 
	 public void accept()
	 {
		 System.out.println("enter the name age,sal");
		 name=sc.next();
		 age=sc.nextInt();
		 sal=sc.nextDouble();
	 }
		 
		 
		 
		 public void checkAge()
		 {
			 if(age>18)
				 System.out.println("you are eligible to vote");
			 else if(age>18 && age<100)
				 System.out.println("invalid age");
		 }
		 public void checkSal()
		 {
			 if(sal>30000 && sal<100000)
				 System.out.println("valid salary");
			 else 
				 System.out.println("invalid salary");
		 }
		 public void display()
		 {
			 System.out.println("enter name"+name);
			 System.out.println("enter age"+age);
			 System.out.println("enter sal"+sal);
			 
		 }
		 
}
		 
		 
		 
			  