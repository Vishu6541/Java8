package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingBy_Sorted {

	public static void main(String[] args) {
		
		List<Integer> sl =new ArrayList<Integer>();
		
		sl.add(0);
		sl.add(10);
		sl.add(5);
		sl.add(20);
		sl.add(25);
		sl.add(1);
		
		
		System.out.println(sl);
		
		System.out.println("DEFAULT NATURAL SORTING ORDER");
		List<Integer> l2 = sl.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("customized  SORTING ORDER");
		List<Integer> l3 = sl.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l3);
		
	}

}
