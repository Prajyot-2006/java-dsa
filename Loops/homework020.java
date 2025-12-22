// HW : Factorial of n 

import java.util.Scanner;

public class homework020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();  // n = 3  => 3*2*1
        int store = n;
        int factorial = 1;
        for(int i=1;i<=store;i++) {
            factorial = factorial*n;
            n--;
        }
        System.out.println(factorial);
    }
}
