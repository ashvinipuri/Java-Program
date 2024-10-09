package enumpack;
enum Days 
{
   MON,TUE,WED,THUR,FRI,SAT,SUN
}
public class EnumDays {

	public static void main(String[] args) 
	{
		Days d=Days.MON;
		System.out.println(d);
		
		switch(d)
		{
		case MON:
		System.out.println("This is first day of the week");
		break;
		case TUE:
			System.out.println("thuesday");
			break;
		case WED:
			System.out.println("wednesday");
			break;
			
		case THUR:
			System.out.println("thursday");
			break;
		case FRI:
			System.out.println("friday");
			break;
		case SAT:
			System.out.println("lets go");
			break;
		case SUN:
			System.out.println("sunday is holiday");
			break;
	}

}
}