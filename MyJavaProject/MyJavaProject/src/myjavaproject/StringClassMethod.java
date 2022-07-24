
package myjavaproject;

public class StringClassMethod {
    public static void main(String Args[]){
        String s1 =   "Hello Anish";
        char ab = s1.charAt(6);// charAt is use to find out charactar in a perticular place 
        System.out.println(ab);
        
        String s2 = "welcom";
        String s3 = s1.concat(s2);// concat method is use to join two string 
        System.out.println(s3);
        
        String s4= "Anish Kumar";
        boolean b=s4.contains("AK"); // Contain method is use to check particular or sequance of charactor in it 
        System.out.println(b);
        
        String s5= "Hello Java";
        boolean c =s5.endsWith("ava"); // endWith is use to check end cheractor is same or not 
        System.out.println(c);
        
        String s6 = "Heloo Anish";
        boolean d = s6.startsWith("He");//startWith is use to check stsrting cheractor is same or not 
        System.out.println(d);
        
        String s7 = "Hello Anish";
        String s8 = "hello Anish";
        boolean e= s7.equals(s8); // equals chceck whether two strings are equal or not and its contain case sensative 
        boolean f=s7.equalsIgnoreCase(s8);//equalsIgnoreCaseis use for ignore case senssative 
        System.out.println(f);
        
        String s9 = "hello Anish";
        int g = s9.indexOf("o");// indexOf mehod is use to count index of charactor
        System.out.println(g);
        
        String s10 = "";
        boolean h = s10.isEmpty();
        System.out.println(h);
        
        String s11 = "Anish Kuamr";
       int i = s11.lastIndexOf("h");
        System.out.println(i);
        
        
       String s12 = "Anish KUmar";
       int j = s12.length(); // length is use to count the number of charactor in string 
        System.out.println(j);
        
        String s13 = "Anish Kumar";
        String s14 =s13.replace('a', 'm'); // replace is use to replace first charactor to seconf charactor a->m
        System.out.println(s14);
        
        String s15 = "anish kumar";
        //String s16 = s15.replaceFirst("a", "z"); // for first latter
        
         String s16 =s15.replaceAll("a", "z"); /// for all latter
        System.out.println(s16);
        
        String s17 = "hello Anish";
        String s18 = s17.substring(2,8); //used to out substring using first and last index
        System.out.println(s18);
        
        String s19 = "hello AnisH";
       // String s20 = s19.toLowerCase();// for lowercase
        String s20 = s19.toUpperCase();
        System.out.println(s20);
        
        
       String s21= "  hello Anish    ";
       String s22 = s21.trim();//
        System.out.println(s22.length());
        
        
       
       
        
        
        
    }
}
