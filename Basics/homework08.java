// HW : take a number from user and print its square
import java.util.Scanner;
public class homework08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  // inputs lene ke liye 
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int square = number * number;
        System.out.print("The square is : "+square);

    }
}
