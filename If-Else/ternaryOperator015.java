// Ternary Operator means if else likhne ka shorter technique or if-else ka short cut 
// condition ? sach : jhoot
// solving even odd using ternary operator

import java.util.Scanner;

public class ternaryOperator015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

/*      in If-Else
        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
*/
        // Using Ternary Operator
        System.out.println((n%2==0) ? "Even" : "Odd");
    }
}