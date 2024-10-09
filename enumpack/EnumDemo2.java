package enumpack;
enum Month1 
{
  JAN,FEB,MAR,APR,MAY
}
public class EnumDemo2 {

	public static void main(String[] args) {
		Month1 m=Month1.JAN;
		System.out.println(m);
		switch(m)
		{
		case JAN:
		System.out.println("This is first month of the year");
		break;
		case FEB:
			System.out.println("Month of Love");
			break;
		case MAR:
			System.out.println("Let us complete the project");
			break;
		case APR:
			System.out.println("April full to all.....");
			break;
		case MAY:
			System.out.println("Oooo...What a high Temperature");
			break;
		
		
		
		
		}
	}
	
}

	


