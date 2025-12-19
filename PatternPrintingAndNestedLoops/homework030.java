/*  Second method : using 2 variables
Ques: Print the given pattern  if n=5

    *
   ***
  *****
 *******

*/

import java.util.Scanner;

public class homework030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int store = n;
        int nst = 1; 
        for(int i=1;i<=n;i++) {
            
            for(int j=1;j<=store-1;j++) {
                System.out.print(" ");
            }
            store--;

            for(int j=1;j<=nst;j++) { 
                System.out.print("*");
            }
            nst = nst + 2;
            System.out.println("");
        }

    }
}