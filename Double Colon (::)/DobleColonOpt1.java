interface intref{
//funcional interface
public void m1();

}
class DoubleColonOpt1{

public static void m2(){
    System.out.println("m2 method call by m1 reference");
}

public static void main(String []aa){
    
    intref i = DoubleColonOpt1::m2;
   
     i.m1();

     //output : m2 method call by m1 reference
}

}
