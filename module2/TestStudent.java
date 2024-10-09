package module2;

public class TestStudent
{

	public static void main(String[] args)
	{
	System.out.println("creating first object");
	Student student=new Student();
	student.accept();
	student.display();
	student.attendClass();
	student.apperExam();
	student.competeAssignment();	}
}