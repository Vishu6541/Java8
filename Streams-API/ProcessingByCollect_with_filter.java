package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingByCollect_with_filter {

	public static void main(String[] args) {
		
		List<String> sl =new ArrayList<String>();
		
		sl.add("Pawan");
		sl.add("Ravi Taneja");
		sl.add("Chiranjeevi");
		sl.add("parvitaa");
		sl.add("Nagarjun");
		
		System.out.println(sl);
		
		System.out.println("FIND NAME IF LENGTH >=9 WITH STREAMS BY FILTER \n\n");
		
		List<String>fl =sl.stream().filter(i->i.length() >=9).collect(Collectors.toList());
		System.out.println(fl);

	}

}
