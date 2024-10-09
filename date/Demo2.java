package date;

import java.util.Date;
import java.text.*;

public class Demo2 {

	public static void main(String[] args) {
		Date d = new Date(); // 1 step : create obj of date class
		// System.out.println(d);

		// 2 step: to format the date create SimpleDateFormat object
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd ' at ' hh:mm:ss a"); // E shows day in characters
		// class obj foramt parameters

		System.out.println("date is " + sdf.format(d)); // 3 step give sop statement
		// obj method

	// 2 step
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM  'month' "); // 2 step
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd 'date' "); // 2 step

		System.out.println(" year is " + sdf.format(d));
		System.out.println(" month is " + sdf2.format(d));
		System.out.println(" date is " + sdf3.format(d));

	}

}
