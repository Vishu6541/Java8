package Main;

import java.util.ArrayList;
import java.util.List;

public class ProcessingBy_ToArray_method {

	public static void main(String[] args) {
		
		List<Integer> sl =new ArrayList<Integer>();
		
		sl.add(0);
		sl.add(10);
		sl.add(5);
		sl.add(20);
		sl.add(25);
		sl.add(1);
		
		
		System.out.println(sl);
	
		Integer [] arr =sl.stream().toArray(Integer[] :: new);
		System.out.println("List copy into array");
		for(Integer i1:arr) {
			System.out.println(i1);
		}
		
	
		
	}

}
