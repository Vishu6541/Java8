package Main;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiMap {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(25);

		System.out.println(al);

		System.out.println("PERPORM DOUBLE OPERATION OF EACH ELEMENTS \n \n \n");

		System.out.println("WITHOUT STREAM API");

		List<Integer> witoutStreamList = new ArrayList<Integer>();

		for (Integer i1 : al) {
			witoutStreamList.add(i1 * 2);
		}
		System.out.println(witoutStreamList);
		
		System.out.println("\n\n\n\n ");
		
		System.out.println("WITH STREAM API ");
		List<Integer> withStrams =al.stream().map(i-> i*2).collect(Collectors.toList());
		System.out.println(withStrams);
	}

}
