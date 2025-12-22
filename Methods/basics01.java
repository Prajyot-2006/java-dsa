// built-in Methods = learn about some Math. methods 

import java.util.Scanner;

public class basics01 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(64));
        System.out.println(Math.abs(-493));  // absolute - negative to positive bana deta hai
        System.out.println(Math.floor(6.9));  // floor fn - means gives floor value of an decimal in this case ans is = 6
        System.out.println(Math.floor(-6.9));  // in this case ans is = -7
        System.out.println(Math.min(3,6));
        System.out.println(Math.max(3,6));
        System.out.println(Math.pow(3,3));  // 3 ki power 3 so ans is 27


        // Ques : print the max of 3 numbers with the help of built-in function 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter c : ");
        int c = sc.nextInt();

        int firstCheck = Math.max(a, b); // gives max from a,b
        int secondCheck = Math.max(firstCheck, c); 
        System.out.println(secondCheck);
    }
}
