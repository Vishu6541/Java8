package joda;

import java.time.LocalDateTime;

public class LocalDateTimeClassDemo {

	public static void main(String[] args) {
		
		LocalDateTime dt =LocalDateTime.now();
		System.out.println(dt);
		
		int dd =dt.getDayOfMonth();
		int mm =dt.getMonthValue();
		int yyy =dt.getYear();
		
		
		
		int h =dt.getHour();
		int m =dt.getMinute();
		int s =dt.getSecond();
		int ns =dt.getNano();
		
		System.out.println("time");
		System.out.printf("%d:%d:%d:%d",h,m,s,ns);
		System.out.println();
		System.out.println("date");
		System.out.printf("%d-%d-%d",dd,mm,yyy);
	}

}
