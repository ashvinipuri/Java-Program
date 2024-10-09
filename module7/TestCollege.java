package module7;
class Stream{
	private String type;
	private int fees;
	 private int noOfStudents;
	public Stream(String type, int fees, int noOfStudents) {
		super();
		this.type = type;
		this.fees = fees;
		this.noOfStudents = noOfStudents;
	}
	@Override
	public String toString() {
		return "Stream [type=" + type + ", fees=" + fees + ", noOfStudents=" + noOfStudents + "]";
	}
	 
	 
}
class College

{
	private String name;
	private char grade;
	private String address;
	private String contactNo;
	public College(String name, char grade, String address, String contactNo) {
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "college [name=" + name + ", grade=" + grade + ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
	
}
	// para constructor,toString

public class TestCollege {

	public static void main(String[] args) {
		College college=new College("MET",'A',"nashik","12345 666 77");
        Stream stream1=new Stream("CS",70000,80);
		Stream stream2=new Stream("IT",80000,80);
		Stream stream3=new Stream("ENTC",90000,80);
		Stream stream4=new Stream("MECH",60000,80);
		Stream stream5=new Stream("CIVIL",50000,80);
		
		
		 // TO DISPLAY ALL THE DETAILS
		System.out.println(college);
		System.out.println(stream1);
		System.out.println(stream2);
		System.out.println(stream3);
		System.out.println(stream4);
		System.out.println(stream5);
	}

}
