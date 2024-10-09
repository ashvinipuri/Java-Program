package enumpack;

public class EnumDemo3
  { // declare variables and method
	enum Month1 
	{
	  JAN,FEB,MAR,APR,MAY;
	  int price=100;
	  
	  public int getPrice()
	  {
		  return price;
	  }
	}

	public static void main(String[] args) 
	{
		Month1 m=Month1.JAN;
		System.out.println("month is " + m);
		System.out.println("price is " + m.getPrice());
		// switch case
	}

}
