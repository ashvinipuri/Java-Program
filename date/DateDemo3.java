package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd ' at ' hh:mm:ss a"); // E shows day in characters
 //class obj format
System.out.println("date is " + sdf.format(d));

SimpleDateFormat sdf1 = new SimpleDateFormat(" 'dd'/ 'mm'/'yy' ");
SimpleDateFormat sdf2 = new SimpleDateFormat(" 'dd'/ 'B'/'yy' ");
SimpleDateFormat sdf3 = new SimpleDateFormat("hh 'h' 'mm m' 'ss s' 'SS'ms  'a' '[z]' ");

System.out.println("Date format is :"+ sdf1.format(d));
System.out.println("Date  format is :"+ sdf2.format(d));
System.out.println("Date  format is :"+ sdf3.format(d));
System.out.println("Time is :"+ sdf.format(d));


	}

}
