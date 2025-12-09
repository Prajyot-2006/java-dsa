// Ques: Take 3 positive integers input and print the greatest of them. (another method) using ternary Operator

import java.util.Scanner;

public class ternaryOperator017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int a = sc.nextInt();

        System.out.print("Enter second integer : ");
        int b = sc.nextInt();

        System.out.print("Enter third integer : ");
        int c = sc.nextInt();

        // Ternary Operator : (condition) ? if : else 
        int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
        System.out.println(max);

        
    }
}


/*
        if(a>b) {    // b is min
            if(a>c) System.out.println(a);  // a is max
            else System.out.println(c); // c is max
        }
        else {  // b > a
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }
*/