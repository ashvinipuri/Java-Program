package module5;

 class Myclass
{
public void fun1()
{
	System.out.println("this is fun 1");
}
}
class Myclass2
{
	public void fun2()
	{
		System.out.println("this is fun 2");
	}
}
public class Myclass1
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Myclass2 myclass2=new Myclass2();
myclass2.fun2();
Myclass myclass=new Myclass();
myclass.fun1();
	}

}
