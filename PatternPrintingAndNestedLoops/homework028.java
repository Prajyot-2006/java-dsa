/*  
Ques: Print the given pattern  if n=5

*****
 ****
  ***
   **
    *

*/

import java.util.Scanner;

public class homework028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int store = n;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i-1;j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=store;j++) {
                System.out.print("* ");
            }
            store--;
            System.out.println();
        }

    }
}
