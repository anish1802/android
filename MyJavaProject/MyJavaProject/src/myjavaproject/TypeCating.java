
package myjavaproject;

public class TypeCating {
    public static void main (String args[]){
      
        //widening casting (automatcally)
        int x = 10; // smaller 
        double y; // larger
        y = x; 
        
        System.out.println(y);
        
        // Narrowing casting 
        
        double m= 6.99d;  // Larger
        int n ; // smaller
        n=(int)m; //Typecasting 
        System.out.println(n);
        
    }
    
}
