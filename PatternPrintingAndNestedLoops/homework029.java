/*  First method : (second method is easiest refer it first )
Ques: Print the given pattern  if n=5

    *
   ***
  *****
 *******

*/

import java.util.Scanner;

public class homework029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int store = n;
        int keep = 1;

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=store-1;j++) {
                System.out.print("  ");
            }
            store--;

            for(int j=1;j<=2*i-1;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
