
package myjavaproject;


public class MathClass {
    
    public static void main(String args[]){
        int x = -10;
        int output = Math.abs(x); // Math.abs is gives only +ve output 
        System.out.println(output);
        
        int y = 64;
      //  double A = Math.cbrt(y); Math.cbrt for cube root
          double A = Math.sqrt(y); // Math.sqrt for square root
        System.out.println(A);
        
        double b= 4.6;// -> 5
       // double B = Math.ceil(b); // if value 4.00004 its give 5.00
       //   double B = Math.floor(b); // if value is 4.0004 it gives 4.00
       //    double B = Math.rint(b); // it gives nearest value 
           double B = Math.round(b); // it give round of number 
        System.out.println(B);
        
        int m = 10;
        int n = 20;
       // int out = Math.max(m, n); // it gives maximum number
        int out = Math.min(m, n); // it gives  minum number 
        System.out.println(out);
        
        int o = 10;
 
     //   double O = Math.log(o);  Value of log
      //    double O = Math.log10(o);
         double O = Math.exp(o);
         System.out.println(O);
         
         int z = 3;
          int g =2;
          double  Z = Math.pow(z, g);
          System.out.println(Z);
        
        
    }
    
}
