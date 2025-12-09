// HW : Take poositive integer input and tell if it is divisible by 5 or not 

import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if(number%5 == 0) {
            System.out.println("Yes it is divisible by 5");
        }
        else{
            System.out.println("No it is not divisible by 5");
        }
    }
}
