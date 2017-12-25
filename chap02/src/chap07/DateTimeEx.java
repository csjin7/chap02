package chap07;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);

		LocalDate targetDate = LocalDate.of(2024, 4, 19);
		System.out.println(targetDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		LocalTime targetTime = LocalTime.of(8, 30, 15, 10);
		System.out.println(targetTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 8, 59, 15, 10);
		System.out.println(targetDateTime);
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcDateTime);
		
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		
		System.out.println("Instant 시간 차이 : " + instant1.until(instant2, ChronoUnit.NANOS));
		
		System.out.println("Instant 시간 차이 : " + instant1.until(instant2, ChronoUnit.MILLIS));
		
		
		
	}

}
