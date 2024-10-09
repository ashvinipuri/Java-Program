package validation;
import java.util.Scanner;
public class EmailValidation {
	public void checkEmail(String email)
	{
		int a=email.indexOf("@");   // return position of @
		 // if@ not present will return -1
		int d=email.lastIndexOf(".");
		//System.out.println(a);
	//	System.out.println(d);
		if(a> -1 && d>-1 && a<d)
			System.out.println("valid email id");
		else
			System.out.println("invalid email id");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmailValidation emailvalidation=new EmailValidation();
		System.out.println("Enter your email id");
        String email=sc.next();
        
        emailvalidation.checkEmail(email);
	}

}
