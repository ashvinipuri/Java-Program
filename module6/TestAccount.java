package module6;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account=new Account();

account.setAccNo(1);
account.setAccName("Ashvini");
account.setAccBalance(500000);
System.out.println(account);



System.out.println("================================");
System.out.println("creating the 2 nd object");
Account account2=new Account(1,"ashmol",1000000);
System.out.println(account2);
	}

}
