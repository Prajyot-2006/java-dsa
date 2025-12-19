/*  
Ques: Print the given pattern  if n=4
   A
  BB
 CCC
DDDD

*/

import java.util.Scanner;

public class homework026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int store = n;

        for(int i=1;i<=n;i++) {
            
            for(int j=1;j<=store-1;j++) {
                System.out.print(" ");
            }
            store--;

            for(int j=1;j<=i;j++) {
                int x = i+64;
                char y = (char)x;
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}
