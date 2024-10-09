package module2;

public class MathDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     System.out.println(Math.sqrt(144)); // to find square root
     System.out.println(Math.abs(-55)); //convert into positive 
     System.out.println(Math.min(10,20)); //10
     System.out.println(Math.max(10,20));//20
     System.out.println("no is "+Math.random()); //generates decimal numbers between 0 to 1
     double d=(int)(Math.random()); //random is used in captcha,OTP,in online examinations system
     System.out.println("d is"+d);
     System.out.println(Math.round(676.99)); // it rounds the number
     
     System.out.println(Math.ceil(878.12)); //879.0
     System.out.println(Math.floor(878.66)); //878.0
     System.out.println(Math.round(878.66)); //879
     System.out.println(Math.pow(2,4)); //16
     System.out.println(Math.tan(45));
     System.out.println(Math.log10(20));
	}     

}
