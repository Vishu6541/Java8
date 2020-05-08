package joda;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeTwo {

	public static void main(String[] args) {
		
		LocalDate date =LocalDate.now();
		
		int dd =date.getDayOfMonth();
		int mm =date.getMonthValue();
		int yyyy =date.getYear();
	
		System.out.println("Date");
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println();
		LocalTime time =LocalTime.now();
		
		int h =time.getHour();
		int m =time.getMinute();
		int s =time.getSecond();
		int ns =time.getNano();
		
		System.out.println("time");
		System.out.printf("%d:%d:%d:%d",h,m,s,ns);
		

	}

}
