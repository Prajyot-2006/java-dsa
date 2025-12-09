// Ques: Take 3 positive integers input and tell if they can be the sides of a triangle or not.
// a+b>c a+c>b b+c>a

import java.util.Scanner;

public class homework09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd side : ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd side : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b) {
            System.out.println("yes they can be sides of a triangle");
        }
        else {
            System.out.println("No they cant be");
        }
    }
}
