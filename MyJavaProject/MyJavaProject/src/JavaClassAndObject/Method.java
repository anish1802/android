
package JavaClassAndObject;


public class Method {
//   static void myMethod(){
//       System.out.println("I just got exicuted");
//   }
//   public static void main(String args[]){
//       myMethod();
//   }
    
    
    public static void main (String[] args){
        
        Method A = new Method();
        A.abc(6, 10 , "hello");
        
        
    }
    
    void abc(int x,int  y, String xy){
        System.out.println(x+y);
        System.out.println(xy);
    }
    
    
}
