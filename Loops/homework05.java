// Ques: Print numbers from ‘n’ to 1.

import java.util.Scanner;

public class homework05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();  // 8 
 
        for(int i=n;i<=n;i--) {  // 8 
            System.out.println(i);
            if(i==0) {
                break;
            }

        }
    }
}
