package inheritence;

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("Ashvini", 25, 'F');
		System.out.println(person); // will call toString method
		person.display();
		person.fun1();
		
		System.out.println("=======================");
	    Student student=new Student("Ash",25,'F',"MECH",22,78);
	     System.out.println(student);
		person.display();
		
		
		System.out.println("==============");
		Emp emp=new  Emp("Ashvini", 25, 'F',"MECH",22,78,2,"TCS",100000);
		System.out.println(emp);
		
	}
}

