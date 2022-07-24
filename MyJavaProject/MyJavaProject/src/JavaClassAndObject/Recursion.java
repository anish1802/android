
package JavaClassAndObject;

public class Recursion {
    
    int i = 1;
    public static void main(String[] args){
         Recursion obj1 = new  Recursion();
         obj1.abc();
        
    }
    
    void abc(){
        System.out.println(2*i);
        i++;
        if(i<=10){
         abc();   
        }
        
    }
}
