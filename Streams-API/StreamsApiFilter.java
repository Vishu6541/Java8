import java.util.*;
import java.util.stream.*;
class StreamsApiFilter{

    public static void main(String[]arr){

        List<Integer> al =new ArrayList<Integer>();
        al.add(0);
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(15);
        al.add(25);
    
        System.out.println(al);
        
        System.out.println("FILTER LIST USEING STREAMS API FILTER() METHOD ");

        List<Integer> shortList = al.stream().filter(i -> i%2 ==0).collect(Collectors.toList()) ;
        
        System.out.println(shortList);           
    }

}
