package module6;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Customer customer=new Customer();
  System.out.println(customer);   //will call toString
 // System.out.println("cust id"+customer.getcustid());
// System.out.println("name is"+customer.getName());
 // System.out.println("mobileno"+customer.getmobileno());
  //System.out.println("address"+customer.getaddress());
  
  System.out.println("===========================");
  
  System.out.println("creating the 2nd object");
 Customer customer1=new Customer(2,"Ashvini","pune",764);
  System.out.println("displaying the details");
  System.out.println("cust id"+customer1.getcustid());
  System.out.println("name is"+customer1.getName());
  System.out.println("mobileno"+customer1.getmobileno());
  System.out.println("address"+customer1.getaddress());
  
  
  System.out.println("customer1");
	}

}
