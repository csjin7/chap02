package chap07;

import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date now = new Date();
//		
//		String strNow1 = now.toString();
//		
//		System.out.println(strNow1);
//		
//		SimpleDateFormat sdf = 
//				new SimpleDateFormat("yyyy/ mm/ dd일" );
//		
//		String strnow2 = sdf.format(new Date());
//		System.out.println(strnow2);
//		strnow2 = sdf.format(now);
//		System.out.println(strnow2);
		
		TimeZone timezone = TimeZone.getTimeZone("Europe/Madrid");
		Calendar now = Calendar.getInstance(timezone);
		//Calendar now = Calendar.getInstance();
		
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		int hour = now.get(Calendar.HOUR);
		
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.println(year +"|"+ month +"|"+ day +"|"+ week +"|"+ hour +"|"+ minute +"|"+ second);
		
		String[] availTimezone = TimeZone.getAvailableIDs();
		
		for (String string : availTimezone) {
			System.out.println(string);
		}
	}

}
