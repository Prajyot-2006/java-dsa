
/*
Ques: Print the given pattern  for n=4 
A
AB
ABC
ABCD
*/

import java.util.Scanner;

public class homework011 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                int x = j+64;
                char y = (char)x;
                System.out.print(y);
            }
            System.out.println();
        }
    
   } 
}
