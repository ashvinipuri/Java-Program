/* customer
 * private int custid
 * name:String
 * mobile:int;
 * address:string
 */


package module6;

public class Customer 
{       // mv
	private int custid;
	private String name;
	private int mobileno;    //
    private String address;

      // default custructor
	public Customer()
	{

		custid = 0;
		name = null;
		mobileno=0;
		address=null;

	}

	public Customer(int custid, String name,String address,int mobileno) {

		super(); // short cut to genrert para const
		this.custid = custid;
		this.name = name;
        this.mobileno=mobileno;
		this.address= address;

	}



	// getter method and setter methd using short cut

	public int getcustid() {

		return custid;
	}

	public void setcustid(int custid)
	{
		this.custid = custid;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {

		this.name = name;

	}



	public int getmobileno() {

		return mobileno;

	}
	public void setmobileno() {

		this.mobileno=mobileno;

	}


	public void setaddress() {

		this.address=address;

	}
	public String getaddress() {

		return address;

	}
	
	
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", mobileno=" + mobileno + ", address=" + address
				+ "]";
	}
}



	



	