
package JavaClassAndObject;


public class ClassAttribute {
    int x = 10;
    public static void main(String args[]){
        
        ClassAttribute obj = new ClassAttribute();
        obj.x = 30; // modify
        System.out.println(obj.x);
    }
    
}
