/*
Ques: Print the given pattern  if row=5 and col=7
*******
*     *
*     *
*     *
*******
*/

import java.util.Scanner;

public class homework018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter columns : ");
        int cols = sc.nextInt();

        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                if(i==1 || i==rows || j==1 || j==cols) {  // done for rows 
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
