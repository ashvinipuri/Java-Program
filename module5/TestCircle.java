package module5;

public class TestCircle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Circle circle=new Circle();
circle.accept();
circle.calarea1();
circle.calperi();
circle.display();


System.out.println(circle.hashCode());
System.out.println(circle.hashCode());
System.out.println(circle.hashCode());

// compare the objects
boolean result=circle.equals(circle);
System.out.println();
	}

	
}
