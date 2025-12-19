/*
Ques: Print the given pattern  if n=5
*       *
  *   *
    *
  *    *
*        *  

*/

import java.util.Scanner;

public class homework021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int number = 1;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }

    }
}
