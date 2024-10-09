package module5;

public class OverloadingDemo 
{
// we did not have to create an object to call the static method
 static public int add(int a, int b)
 {
	 return(a+b);
 }
 static public int add(int a, int b,int c)
 {
	 return(a+b+c);
 }
 static public double add(int a, double b)
 {
	 return(a+b);
 }
 
	public static void main(String[] args) 
	{
	 int result=add(10,20); // 1 method call  directly call functions without using object because we use static keyword
     System.out.println(result);
     int result1=add(10,20,30); // 2 method call
     System.out.println(result1);
     double result2=add(10,20.50); // 3 method call
     System.out.println(result2);
     
	}

}
 