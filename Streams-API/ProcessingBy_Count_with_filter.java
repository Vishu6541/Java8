package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingBy_Count_with_filter {

	public static void main(String[] args) {
		
		List<String> sl =new ArrayList<String>();
		
		sl.add("Pawan");
		sl.add("Ravi Taneja");
		sl.add("Chiranjeevi");
		sl.add("parvitaa");
		sl.add("Nagarjun");
		
		System.out.println(sl);
		
		System.out.println("GET HOW MANY NAME ARE >=9 \n");
		
		List<String>fl =sl.stream().filter(i->i.length() >=9).collect(Collectors.toList());
		System.out.println("Elemnts is "+fl +"\n");
		
		long count =sl.stream().filter(i->i.length() >=9).count();
		System.out.println("And count is "+count);

	}

}
