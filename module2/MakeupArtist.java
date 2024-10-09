/* private int rate
 private string name
 private int contact number
 
 public void accept()
public void display()
public void addCertification()
public void bookAppointment()
public void sendMessage()
 */


package module2;

import java.util.Scanner;

public class MakeupArtist 
{
	// member variables
		private  int rate;
		private String name;
		private int contactnumber;
	   
	   Scanner sc=new Scanner(System.in); //2nd step
	   public void accept()
	   {
		   System.out.println("enter the rate");
		   rate=sc.nextInt();
		   System.out.println("enter the name");
		   name=sc.next();
		   System.out.println("enter the contact number");
		   contactnumber=sc.nextInt();
	   }
	 //member functions
	    public void addCertification()
	    {
	   	System.out.println("adding certification");
	    }

	     public void sendMessage()
	     {
	   	  System.out.println("sending the message");  
	    }
	     
	     public void bookAppointment ()
	     {
	   	  System.out.println("booking of  the appointment");
	     }
	     public void display()
	     {
	    	System.out.println("rate="+rate);
	    	System.out.println("name="+name);  
	    	System.out.println("contactnumber="+contactnumber); 
	     }

	}


