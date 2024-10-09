package multithreading;
class MultiThread extends Thread
// ch class parent class
{
	public void run() // overriding the thread classs method
	{
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName(); // getid,getname is method
		System.out.println("id is:" + id); // id and name is properties
		System.out.println("Thread name is:" + name);
//      System.out.println("Ashvini");
//      System.out.println("cadc Nashik");
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MultiThread thread1 = new MultiThread();
			thread1.start(); // will call run()
		}
	}
}

//		System.out.println("=====================================");
//		Multithread thread2=new Multithread();
//		thread2.start();     // will call run()
//		
//		
//		System.out.println("=====================================");
//		Multithread thread3 =new Multithread();
//		thread3.start();     // will call run()
//		
//		System.out.println("=====================================");
//	//	for(int i=0;i<5;i++) 
//		{
//			Multithread thread =new Multithread();
//			thread.start();
//		}
//		
//	}
//	}
//}
