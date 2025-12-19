/* 
Ques: Print the given pattern  if n=5
*********
**** ****
***   ***
**     **
*       *

*/

import java.util.Scanner;

public class homework031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int store = n-1;
        int save = n-1;
        int keep = 1;

        for(int s=1;s<=(2*n-1);s++) {
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=n;i++) {

            for(int j=1;j<=store;j++) {  // stars
                System.out.print("* ");
            }
            store--;

            for(int r =1;r<=keep;r++) {  // space 
                System.out.print("  ");
            }
            keep = keep + 2;

            for(int p=1;p<=save;p++) {  // stars
                System.out.print("* ");
            }
            save--;

            System.out.println("");
        }

    }
}
