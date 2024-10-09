package aggrregationassignment;

public class TestAddress {

	public static void main(String[] args) {
		 Address address = new Address("Pune", "Maharashtra", "India");
	        Address address1 = new Address("Beed", "Maharashtra", "India");
	        Address address2 = new Address("Kallam", "Maharashtra", "India");

	        Name name = new Name("Ashvini", "Amol", "Giri");
	        Name name1 = new Name("Ashvini", "Bhagwat", "Puri");
	        Name name2 = new Name("Ashvini", "Amol", "Puri");

	        Student student = new Student(1, name, address);
	        Student student1 = new Student(2, name1, address1);
	        Student student2 = new Student(3, name2, address);

	        // Call display method to show student information
	        student.display();
	        student1.display();
	        student2.display();
	    }
	}
