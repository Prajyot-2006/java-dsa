/*
Ques: Print the given pattern  if n=5
  *  
  *
*****
  *
  *
*/

import java.util.Scanner;

public class homework019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int mid = n/2 + 1;
                if(i==mid || j==mid) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
