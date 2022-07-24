
package myjavaproject;


public class Arrays {
    public static void main (String args[]){
        String[] arr = {"Hello", "Java","Anish"};
        System.out.println(arr[2]);
        
        arr[2]="Raj";
        System.out.println(arr[2]);
        System.out.println(arr.length);
        
        String[] Cars = {"Volvo","BMW","Ford"};
       //   for(int i = 0; i < Cars.length; i++){
       //     System.out.println(Cars[i]);
         for(String i : Cars){
           System.out.println(i);
        }
    }
    
}
