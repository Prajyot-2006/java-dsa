// HW : Take a positive integer input and print if the int is even or odd 

import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no : ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("The no is Even");
        }
        else{
            System.out.println("The no is Odd");
        }
    }
}
