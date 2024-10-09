package Static;

public class StaticVarDemo {
	static int num=1;
	
	public void display()
	{
		num++;
		System.out.println(num);
	}
	public static void main(String[] args) {
		System.out.println(num);   // method 1
		System.out.println(StaticVarDemo.num);    //  2 method it is working bcoz it is a class level variable
		
		StaticVarDemo obj=new StaticVarDemo();
		obj.display();         // 
	
		
		StaticVarDemo obj2=new StaticVarDemo();
		obj.display();         // 
		
		StaticVarDemo obj3=new StaticVarDemo();
		obj.display();         // 
	}
	
	

}
