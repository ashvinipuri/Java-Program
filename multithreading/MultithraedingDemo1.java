package multithreading;
class Demo{
	public void fun1()
	{
		System.out.println("this is fun1");
	}
	public void fun2()
	{
		System.out.println("this is fun2");
	}
}
class Multithreadd extends Thread{
//   ch class           parent class
	Demo demo= new Demo();
	

	public void  run()   // overriding the thread classs method
	{
		
		long id=Thread.currentThread().getId();
		String name=Thread.currentThread().getName();  // getid,getname is method
		System.out.println("id is:" + id);   // id and name is properties
		System.out.println("Thread name is:" + name);
//    System.out.println("Ashvini");
//    System.out.println("cadc Nashik");
	}
}



public class MultithraedingDemo1 {
	public static void main(String[] args) {
	 for(int i=0;i<=20;i++) {
		Multithreadd thread1 =new Multithreadd();
		thread1.start();  // will call run()
	}
	}

}



