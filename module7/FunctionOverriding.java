package module7;
  class Shape{
	void calArea(String shape,int a,int b)
	{
		System.out.println("calArea of shape class");
	}
	void display()
	{
		System.out.println("display of shape class");
	}
	void fun1()
	{
		System.out.println("fun1 of shape class");
	}
}


class Rectangle extends Shape
{      // child class    parent class
	void calArea(String shape,int a,int b)
	{
		System.out.println("Area is"+(a*b));
	}
	void display()
	{
		super.display();
		super.fun1();
	}
	
}
public class FunctionOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Shape shape=new Shape();
           shape.calArea("shape", 10, 20);
           shape.display();
           
           System.out.println("===================================");
           Rectangle rect=new Rectangle();       //static binding
           rect.calArea("rectangle",20,30);
           rect.display();
           
           System.out.println("===================================");
           shape=new Rectangle();          // dynamic binding
   // parent class    child class
           shape.calArea("rect", 11, 22);   // calls calArea of rectangle class
           shape.display();
	}

}
