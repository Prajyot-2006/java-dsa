// HW:Take a number input & print all of - its factors.

import java.util.Scanner;

public class homework013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();

        for(int i=1;i<Math.sqrt(n);i++) {  // /n = 4 
            if(n%i==0) {
                System.out.println(i);
                System.out.println(n/i);
            }
        }

    }

}
