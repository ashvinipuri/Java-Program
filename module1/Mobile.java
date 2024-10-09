/*mobile member variable,member function,main(),
create an object call 2 methods
price
color
name
*/

package module1;

public class Mobile 
{
	private  String color;
    private String name;
    private double price;
    
    public void color() 
    {
   	System.out.println("which color is");
    }
     public void price() 
     {
   	  System.out.println("searching the price");  

    }
     public void mobilename()
     {
   	  System.out.println("mobile name is");
     }
     public void display() 
     {

     System.out.println("price="+price);
     System.out.println("name="+name);  
     System.out.println("color="+color); 

     }

public static void main(String[] args)
{
	// TODO Auto-generated method stub
       Mobile mobile =new Mobile();
       mobile.price=100000.50;
       mobile.name="oneplus";
       mobile.color="black";

       

       System.out.println("calling member fun");

       mobile.display();
       mobile.mobilename();
       mobile.color();
       mobile.price();
}
}

       

     
	


