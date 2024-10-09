package multithreading;
class Multithread2 implements Runnable{
	public void fun1() {
		System.out.println("this is fun1");
	}
	public void fun2() {
		System.out.println("this is fun2");
	}

	@Override
	public void run() {
		fun1();
		fun2();
		System.out.println("id is: "+Thread.currentThread().getId());
		System.out.println("name is: "+Thread.currentThread().getName());
		
	}
}

public class MultithreadingDemo2 
{
	public static void main(String[] args) 
	{
	//	for (int i = 0; i < 5; i++) {
		Multithread2 obj1=new Multithread2();
		Thread th1 =new Thread(obj1);
		th1.start();  // will execute run () methods
		//System.out.println("id is: "+th1.getId());
		//System.out.println("name is: "+th1.getName());
		
//		System.out.println("========================================");
//		Multithread2 obj2=new Multithread2();
//		Thread th2 =new Thread(obj2);
//		th2.start();
//		System.out.println("id is: "+th2.getId());
//		System.out.println("name is: "+th2.getName());
	}
}

