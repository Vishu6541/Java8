interface interf{

public Test get();

}

class Test{
   public Test(){
        System.out.println("Test class object is created");
    }

    public void m1(){
        System.out.println("m1 method is call");
    }

}


public class ConstructorReference_DoubleColonOPT{
         
    public static void main(String []ar){
    
    interf i = Test::new;
    
      Test t1 =i.get();
        
    t1.m1();
            
    }   
    
}
