
package JavaClassAndObject;


public class MethodOverloading {
    public static void main (String[] args){
        MethodOverloading obj = new MethodOverloading();
        
        // First way to call method
      //  obj.sum(5); //  Mehod 1 is calling
       // obj.sum();  // Mehod 2 is calling
       
       
       // second way to call method
       obj.sum(6);
       obj.sum("hello");
       
       
    }
    
//     void sum(int i){
//        System.out.println("Hello Mehod 1 is calling");
//        
//    }
//    
//     
//    
//    void sum(){
//        System.out.println("Hello Mehod 2 is calling");
   //     }
    
    
    
    
    
    
     void sum(int i){
        System.out.println("Hello Mehod 1 is calling");
        
    }
    
     
    
    void sum(String i){
         System.out.println("Hello Mehod 2 is calling");
        
    }
    
}
