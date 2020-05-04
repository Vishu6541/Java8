package Main;

import java.util.ArrayList;
import java.util.List;

public class ProcessingBy_Min_and_Max {

	public static void main(String[] args) {
		
		List<Integer> sl =new ArrayList<Integer>();
		
		sl.add(0);
		sl.add(10);
		sl.add(5);
		sl.add(20);
		sl.add(25);
		sl.add(1);
		
		
		System.out.println(sl);
		
		Integer min = sl.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("Min Value "+min);
		
		Integer max = sl.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("Min Value "+max);
		
		
		sl.stream().forEach(s -> System.out.println(s));
		
	
		
	}

}
