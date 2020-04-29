/*
    BY Lambda Expression
*/
class InstanceReference_DoubleColonOPT{
public static void main(String []aa){

Runnable r= ()->{
        for(int i=0;i<10;i++){
    System.out.println("Child thread");
    }
    };

Thread t1 =new Thread(r);
t1.start();

 for(int i=0;i<10;i++){
    System.out.println("Main thread");
    }


  }

}

/*
    BY DOUBLE COLON OPERATOR
*/

class InstanceReference_DoubleColonOPT{
public void m1(){
    for(int i=0;i<10;i++){
    System.out.println("child thread");
    }
}
public static void main(String []aa){
    
InstanceReference_DoubleColonOPT obj =new InstanceReference_DoubleColonOPT();

Runnable r=obj::m1;

Thread t1 =new Thread(r);
t1.start();

 for(int i=0;i<10;i++){
    System.out.println("Main thread");
    }


  }

}
