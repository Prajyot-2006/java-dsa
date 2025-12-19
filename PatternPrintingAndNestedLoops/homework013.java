
/*
Ques: Print the given pattern  for n=4 
1
AB
123
ABCD
12345
*/

import java.util.Scanner;

public class homework013 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {  // i plays a role of row
            for(int j=1;j<=i;j++) {
                int x = j+64;
                char y = (char)x;
                if(i%2 == 1) {
                    System.out.print(j);
                }
                else {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    
   } 
}
