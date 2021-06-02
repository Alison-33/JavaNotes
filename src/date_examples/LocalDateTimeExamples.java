package date_examples;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExamples {
	
	public static void main(String[] args) {
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println("Current time: " + rightNow);
		System.out.println("Current year: " + rightNow.getYear());
		System.out.println("Current month: " + rightNow.getMonth());
		System.out.println("Current day: " + rightNow.getDayOfMonth());
		System.out.println("Current hour: " + rightNow.getHour());
		System.out.println("Current minute: " + rightNow.getMinute());
		System.out.println("Current second: " + rightNow.getSecond());
		
		LocalDateTime beforeDate = LocalDateTime.of(2019, Month.DECEMBER, 12, 9, 21, 32);
		
		beforeDate = beforeDate.minusYears(2); // minus 2 years
		beforeDate = beforeDate.plusMonths(3); // add 3 months
		beforeDate = beforeDate.withYear(2008); // change the year to 2008 
		beforeDate = beforeDate.withHour(13); // change hour to 13
		
	}
	

}
