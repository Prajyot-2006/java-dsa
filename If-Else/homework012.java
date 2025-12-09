// Ques: Take 3 positive integers input and print the greatest of them.

import java.util.Scanner;

public class homework012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int first = sc.nextInt();

        System.out.print("Enter second integer : ");
        int second = sc.nextInt();

        System.out.print("Enter third integer : ");
        int third = sc.nextInt();

        if(first==second && first==third) {
            System.out.println("All are same");
        }

        else {
            int max = first;

            if(max <second) {
                max = second;
            }
            if(max < third) {
                max = third;
            }

            System.out.println("The greatest number is : "+max);
        }
    }
}
