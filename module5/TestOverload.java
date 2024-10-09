package module5;

public class TestOverload
{
	static void main()
	{
		System.out.println("main method without parameters");
	}
	static void main(int a,int b)
	{
		System.out.println("main method with 2 parameters"+a+" "+b);
	}
	static void main(int a)
	{
		System.out.println("main method with 1 parameters"+a);
	}


	public static void main(String[] args)
	{
		TestOverload.main();
		TestOverload.main(10);
		TestOverload.main(10,20);

	}

}
