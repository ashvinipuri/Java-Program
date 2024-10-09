package module5;

public class CompareString 
{

	public static void main(String[] args) 
	{
		int a=100;
		int b=100;
		if(a==b)
			System.out.println("same");
		String str1="Ashvini";
		String str2="Ashvini";
		if(str1==str2)
			System.out.println("same");
		else
			System.out.println(" not same");
		
		System.out.println("=========================");
		// 2 method to create a string object
		String str3=new String("Ashuni");
		String str4=new String("Ashuni");
		if (str3.equals("Ashuni"))
			System.out.println("same");
		else
			System.out.println(" not same");
		
		System.out.println("====================");
		if (str3.equals("Ashmol"))
			System.out.println("same");
		else
			System.out.println(" not same");
		  
		System.out.println("=========================");
		
		if (str3.equalsIgnoreCase(str4))
			System.out.println("same");
		else
			System.out.println(" not same");
		  
	}

}
