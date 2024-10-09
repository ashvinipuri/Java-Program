package reflection;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
 class Test{
	 private String s;
	 public Test()
	 {
		 s="Hello World";
	 }
	 public void Method1 ()
	 {
		 System.out.println("The String is" +s);
	 }
	 public void Method2(int n)
	 {
		 System.out.println("The number is" +n);
	 }
	 private void Method3()
	 {
		 System.out.println(" private method invoked");
	 }
 }
public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		Test obj=new Test();
		Class cls=obj.getClass();
		System.out.println("The name of class is" + cls.getName());
		
		//getting the constructor of the class through the 
		Constructor constructor =cls.getConstructor();
		
		System.out.println("The public methods of class are:");
		Method[] methods= cls.getMethods();
		for(Method a:methods)
		{
			System.out.println(a.getName());
			
			System.out.println("================================");
			Method methodcall1=cls.getDeclaredMethod("Method2", int.class);
			//                     name       para
			methodcall1.invoke(obj,22);
			
			Field field=cls.getDeclaredField("s"); //mv  s:1
			field.setAccessible(true);  //2
			field.set(obj, "JAVA"); //3
			
			Method methodcall2=cls.getDeclaredMethod("Method1");
			methodcall2.invoke(obj);
			
			Method methodcall3=cls.getDeclaredMethod("Method3");
			methodcall3.setAccessible(true);
			methodcall3.invoke(obj);
			
		}

	}

}
