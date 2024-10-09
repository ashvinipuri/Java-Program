/*   Account
    private int accNo;
    private String accName;
    private double accBalance
    
    
    def cost
    para constructor
    getter setter
    toString()
    
    TestAccount()
    1.create an object without parameters
    2.display all the details
    3. create an object with parameters
    4.display all the details
 */




package module6;

public class Account {
    // mv
	private int accNo;
	private String accName;
	private double accBalance;

      // default custructor
	public Account()
	{

		accNo = 0;
		accName = null;
		accBalance=0;
		 

	}

	public Account(int accNo, String accName,double accBalance) {

		super(); // short cut to genrert para const
		this.accNo= accNo;
		this.accName = accName;
        this.accBalance=accBalance;
		

	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}



	// getter method and setter methd using short cut

	

	}

