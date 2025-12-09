// HW: Take integer input and tell if its magnitude is smaller than 69 or not.
import java.util.Scanner;

public class homework08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");  // -34
        int n = sc.nextInt();

        if(n<0)  {
            n = n*-1;  // make n positive
            if(n<69) {
                System.out.println("Smaller than 69");
            }
        }
        else if(n<69) {
            System.out.println("Smaller than 69");
        }
        else if(n>69) {
            System.out.println("Not smaller than 69");
        }
    }   
}
