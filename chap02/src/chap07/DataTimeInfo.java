package chap07;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataTimeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		
//		now.getYear();
//		now.getMonthValue()
//		now.getDayOfMonth()
//		now.getDayOfWeek()
//		now.getDayOfYear()
//		now.getHour()
//		now.getMinute()
//		now.getSecond()
//		now.getNano()j
//		
//		
//		LocalDate nowDate = now.toLocalDate()
		//메서드 체이닝 
		LocalDateTime targetDateTime = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(1)
				.plusSeconds(10);
		
		System.out.println(targetDateTime);
		
	}

}
