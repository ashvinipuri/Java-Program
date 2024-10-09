package collection;
import java.util.ArrayList;

public class Account {
	private int accNo;
	private String name;
	private double bal;

	public Account() {
		accNo = 0;
		name = null;
		bal = 0.0;
	}

	public Account(int accNo, String name, double bal) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
	}

	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", bal=" + bal + "]";
	}


public static void maim(String[]args) {
ArrayList<Account> arrlist = new ArrayList<Account>();

Account acc = new Account(1, "Ganesh", 50000);
Account acc1 = new Account(2, "Pratik", 40000);
Account acc2 = new Account(3, "Girish", 30000);
Account acc3 = new Account(4, "Kartik", 45000);
Account acc4 = new Account(3, "Radha", 30000);
Account acc5 = new Account(4, "Payal", 45000);

arrlist.add(acc);
arrlist.add(acc1);
arrlist.add(acc2);
arrlist.add(acc3);
arrlist.add(acc4);
arrlist.add(acc5);

for (int i = 0; i < arrlist.size(); i++) {
	System.out.println(arrlist.get(i));
	System.out.println("-----------------------------");
}

}
}
