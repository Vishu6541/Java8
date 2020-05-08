package joda;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneOne {

	public static void main(String[] args) {
	
	ZoneId zone = ZoneId.systemDefault();
	//System.out.println(zone);
	
	// how to get america zone
	
	ZoneId la =ZoneId.of("America/Los_Angeles");
	
	ZonedDateTime dt =ZonedDateTime.now(la);
	
	System.out.println(dt);
	

	}

}
