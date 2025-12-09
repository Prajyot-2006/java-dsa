// Ques: Take positive integer input and tell if it is a four digit number or not.
// here we learned about logical operator

import java.util.Scanner;
public class homework07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer : ");
        int integer = sc.nextInt();

        // check if 4 digit or not
        if(integer>999 && integer<10000) {
            System.out.println("The Integer is of 4 digit");
        }
        else {
            System.out.println("Its not a 4 digit");
        }

    }
}