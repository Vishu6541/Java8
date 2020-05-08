package joda;

import java.time.Year;
import java.util.Scanner;

public class YearClass {

	public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Plaese enter Year check it is Leap year or Not");
	int n =sc.nextInt();
	sc.close();
	Year y =Year.of(n);
	if(y.isLeap()) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	}

}
