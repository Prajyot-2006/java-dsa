package Basics;

public class variable02 {
    
    public static void main(String[] args) {
        int x = 5;  // variable declaration and initialization 
        System.out.println(x);
        
        x = 20;
        System.out.println(x);
        System.out.println(x + "Prajyot");   // it will append not gets add bcoz x is an integer and Prajyot is a string/text  
        
        x = x + 6;
        System.out.println(x);

        x = x*6;
        System.out.println(x); 

        int a = 3;
        int b = 9;
        b = a;
        System.out.println(b);
    }
    
}
