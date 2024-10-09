package exception;

import java.util.Scanner;
//    ch class                parent class
class CheckPassword extends Exception { 
	public CheckPassword(String msg) { // class parameter
		super(msg); // calling parent class  contructor 
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.next();
		try {
			if (password.length() < 8)
				throw new CheckPassword("password length should be more than 8 char");
			// new means anonymous object
			// to check for pattern matching
			else if (password.matches("[A-Za-z0-9]*")) // Ashvini@123 // * is used to check all [A-Za-z0-9]
				throw new CheckPassword("password should have special characters..");
			else
				System.out.println("valid password...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// "[0-9] {6}": 6 numbers are allowed [a-z]{5}: ch allowed

		}
	}

}
