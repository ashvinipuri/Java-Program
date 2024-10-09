package inheritence;

 
public class Student extends Person
{
	protected String stream;
	protected int rollNo;
	 protected double score;
	
	 
	 public Student(String name, int age, char gender, String stream, int rollNo, double score) {
		super(name, age, gender);
		this.stream = stream;
		this.rollNo = rollNo;
		this.score = score;
	}

	public void display()      // function overriding
	 {
		 super.display();       //calling the method of parent class
		 super.fun1();
	 }

	@Override
	public String toString() {
		return "Student [stream=" + stream + ", rollNo=" + rollNo + ", score=" + score + ", name=" + name + ", age="
				+ age + ", gender=" + gender + "]";
	}
       
	
	 
}

