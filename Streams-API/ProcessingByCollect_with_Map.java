package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingByCollect_with_Map {

	public static void main(String[] args) {
		
		List<String> sl =new ArrayList<String>();
		
		sl.add("Pawan");
		sl.add("Ravi Taneja");
		sl.add("Chiranjeevi");
		sl.add("parvitaa");
		sl.add("Nagarjun");
		
		System.out.println(sl);
		
		System.out.println("GET ALL NAME IN UPAR CASE \n\n");
		List<String>fl =sl.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(fl);

	}

}
