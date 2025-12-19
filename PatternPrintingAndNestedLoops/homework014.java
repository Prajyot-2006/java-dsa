/*
Ques: Print the given pattern  for n=4 
****
***
**
*
*/

import java.util.Scanner;

public class homework014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int store = n;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=store;j++) {
                System.out.print("*");
            }
            store--;
            System.out.println();
        }


    }
}
