package module6;
import java.util.Scanner;
public class TestStdudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("entre rollno,name,score");

		int rollNo = sc.nextInt(); // setter to get new values

		String name = sc.next();

		double score = sc.nextDouble();



		Student student = new Student();

		student.setRollNo(rollNo);

		student.setName(name);

		student.setScore(score);



		// student.display();

		System.out.println("displying details");

		System.out.println("rollno is" + student.getRollNo());

		System.out.println("name is" + student.getName());

		System.out.println("score is" + student.getScore());

		student.markAttendance();



		System.out.println("=========");

		System.out.println("creating new object with parameters");

		Student student2 = new Student(3, "Ashvini", 76); // parameterised con

		// student2.display();

		System.out.println("displying details");

		System.out.println("rollno is" + student2.getRollNo());

		System.out.println("name is" + student2.getName());

		System.out.println("score is" + student2.getScore());

		student2.markAttendance();

        System.out.println("=============");

        System.out.println("changing name");

        System.out.println("enter new name");

        String name1=sc.next();

        student.setName(name1);

        System.out.println("new name is"+ student2.getName());

	}
}
        

        

	





