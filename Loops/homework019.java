 // HW : print sum of number and its reverse 

import java.util.Scanner;

public class homework019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();  // n = 123 => result = 321
        int store = n;
        int rev = 0;

        while(n!=0) {
            int lastDigit = n%10;  // to get the lastDigit 
            rev = rev * 10 + lastDigit;
            n = n/10; // to remove the last digit             
        }
        System.out.println(rev);
        int add = store + rev;
        System.out.println("The addition of both number and reverse of number is : "+add);
    }
}
