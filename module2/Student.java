package module2;
import java.util.Scanner; //1 step
public class Student
{ 
	// member variables
	private  int rollNo;
	private String name;
	private double score;
   
   Scanner sc=new Scanner(System.in); //2nd step
   public void accept()
   {
	   System.out.println("enter the roll no");
   rollNo=sc.nextInt();
	   System.out.println("enter the name");
	   name=sc.next();
	   System.out.println("enter the score");
	   score=sc.nextInt();
   }
 //member functions
    public void attendClass()
    {
   	System.out.println("attending the class");
    }

     public void apperExam()
     {
   	 System.out.println("appearing the exam");  
    }
     
     public void competeAssignment()
     {
   	  System.out.println("competing the assignment");
     }
     public void display()
     {
    	System.out.println("rollNo="+rollNo);
    	System.out.println("name="+name);  
    	System.out.println("score="+score); 
     }

}
