package date;
import java.util.*;
public class DateDemo4 
{

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		TimeZone tz=TimeZone.getTimeZone("IST");
		Calendar cal =Calendar.getInstance(tz);
		
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int dow=cal.get(Calendar.DAY_OF_WEEK);
		int doy=cal.get(Calendar.DAY_OF_YEAR);
		int m=cal.get(Calendar.MONTH);
		int y=cal.get(Calendar.YEAR);
		int h=cal.get(Calendar.HOUR);
		int mi=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);
		
		System.out.println("date is " + day);
		System.out.println("day of the week  " + dow);
		System.out.println("day of the year " + doy);
		System.out.println(day  + "/" + m + "/" + y +"/" +" " + h + ":" + mi + ":" +s);
	}

}
