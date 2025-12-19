/*  First method 
Ques: Print the given pattern  if n=4
   *
  **
 ***
****
*/

import java.util.Scanner;

public class homework023 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int numberPlusOne = n + 1;
        int doubleNumber = n+n;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int sum = i + j;
                if(sum>=numberPlusOne && sum<=doubleNumber) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
        
    }
}
