package enumpack;   // enum is user defined data type

interface Interface1  
{
	String comp="OOP";
	void fun1(); // abstrat method
		
}
  //  ch                parent
 enum Month implements Interface1
 {
	 JAN,FEB,MAR,APR,MAY;
	 public void fun1()
	 {
		 System.out.println("this is fun1");
		 
		 
		 
	 }
 }
 
//    1 method  we can access  in outside the class
//    enum Month // Month is  user defined data type variable
//    {
//	    JAN,FEB,MAR,APR,MAY
//    }
public class EnumDemo1 
{
	 //     2nd method we can access in inside the class
	
	//      enum Month 
	//    {
	//       JAN,FEB,MAR,APR,MAY
	//    }
	
	public static void main(String[] args) 
	{
		System.out.println("Display all values: using enhanced for loop");
		for(Month mm:Month.values())
		{
			System.out.println(mm);
		}
		System.out.println("================================");
		
		Month m=Month.JAN;
		System.out.println(m);
		
		System.out.println(Month.JAN);
	//Month m=Month.JAN;  // Month:data type,m:variable
	int a=100;  // int is datatype and a is variable
	
	Month m1=Month.FEB;
	Month m2=Month.MAR;
	Month m3=Month.APR;
	Month m4=Month.MAY;
	
	System.out.println(" m1 is " + m1);
	System.out.println(" m2 is " + m2);
	System.out.println(" m3 is " + m3);
	System.out.println(" m4 is " + m4);
	
	
	m.fun1();  // calling the function
	System.out.println("======================================================");	
//		 3 method  we can access in inside the main
//		enum Month // Month is  user defined data type variable
//		  {
//		JAN,FEB,MAR,APR,MAY
//		   }
		
		System.out.println(Month.JAN);
	//	Month month =new Month(); // Error: Enum class object cannot created
	}

}
