 package joda;

import java.time.LocalDate;
import java.time.Period;

public class PeriodOne {

	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1995, 02, 24);
		LocalDate nowdate =LocalDate.now();
		Period p1= Period.between(birthDate, nowdate);
		System.out.printf("Age is %d years %d months %d Days",p1.getYears() ,p1.getMonths(),p1.getYears());
		
		
	}

}
