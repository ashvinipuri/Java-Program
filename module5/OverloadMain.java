package module5;

public class OverloadMain 
{
public void main()
{
	System.out.println("main method without parameters");
}
public void main(int a,int b)
{
	System.out.println("main method with 2 parameters");
}
public void main(int a)
{
	System.out.println("main method with 1 parameters");
}

	public static void main(String[] args)
	{
		OverloadMain obj=new OverloadMain();
		obj.main(); //1 method call
		obj.main(10);  // 3method call
		obj.main(10,20); //2 method call

	}

}
