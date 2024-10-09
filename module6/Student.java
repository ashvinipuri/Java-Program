package module6;

public class Student
{
	private int rollNo;

	private String name;

	private double score;



	public Student()
	{

		rollNo = 0;

		name = "";

		score = 0.0;

	}



	public Student(int rollNo, String name, double score) {

		super(); // short cut to genrert para const

		this.rollNo = rollNo;

		this.name = name;

		this.score = score;

	}



	// getter method and setter methd using short cut

	public int getRollNo() {

		return rollNo;

	}



	public void setRollNo(int rollNo) {

		this.rollNo = rollNo;

	}



	public String getName() {

		return name;

	}



	public void setName(String name) {

		this.name = name;

	}



	public double getScore() {

		return score;

	}



	public void setScore(double score) {

		this.score = score;

	}



	//public void display() {

//		System.out.println("rollno is" + rollNo);
//
	//	System.out.println("name is" + name);
//
//		System.out.println("score is" + score);



//}



	public void markAttendance() {

		System.out.println("marking the attendance");

	}

}



	 