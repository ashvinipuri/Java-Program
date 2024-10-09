package module2;

public class TestEmployee {

	public static void main(String[] args) 
	{
		System.out.println("creating first object");
		Employee employee=new Employee();
		employee.accept();
		employee.display();
		employee.comleteProject();
		employee.checkAttendence();
		employee.applyLoan();
		
		System.out.println("creating 2nd object");
		Employee employee2=new Employee();
		employee2.accept();
		employee2.display();
		employee2.comleteProject();
		employee2.checkAttendence();
		employee2.applyLoan();
		
		
		
	}
	}
	


