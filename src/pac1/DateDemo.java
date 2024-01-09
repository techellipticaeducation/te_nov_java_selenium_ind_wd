package pac1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
//		Date
// 		Calendar
		
		// date = 1 - 31
		// month = 0 - 11
		// year =1900 +  124 = 2024
		// deprecated
		Date d1 = new Date();
//		System.out.println(d1);
//		System.out.println(d1.getDate());
//		System.out.println(d1.getMonth());
//		System.out.println(d1.getYear());
//		System.out.println(d1.getMinutes());
//		System.out.println(d1.getHours());
//		System.out.println(d1.getSeconds());
//		System.out.println(d1.getDay());
		
		// SimpleDate
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
		System.out.println(dateFormat.format(d1));
	}
}
