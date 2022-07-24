
package JavaClassAndObject;

public class StaticAndNonStatic {
    public static void main(String[] args){
       SaticClass.abc(); // static 
        
        SaticClass obj1 = new SaticClass();
        obj1.bbc(); // non static 
        
        System.out.println(SaticClass.x); // static 
        System.out.println(obj1.y); // non static 
    }
    
}
