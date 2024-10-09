package inheritence;

public class Emp extends Student {
	
	protected int empno;
	protected String company;
	 protected int sal;
	
	public Emp(String name, int age, char gender, String stream, int rollNo, double score, int empno, String company,
			int sal) {
		super(name, age, gender, stream, rollNo, score);
		this.empno = empno;
		this.company = company;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", company=" + company + ", sal=" + sal + ", stream=" + stream + ", rollNo="
				+ rollNo + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	 
	 
}
