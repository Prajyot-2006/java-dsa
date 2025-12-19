/*  Second method (most imp)
Ques: Print the given pattern  if n=4
   *
  **
 ***
****
*/

import java.util.Scanner;

public class homework024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {  // for spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {   // for starrs  also we can name the variable same as upper loop like j  but we cant name the same variable name in nested loop(means loop ke andar loop) these two are the seperate loops not nested loops thats why we can name them with same variable name
                System.out.print("*");
            }
            System.out.println();
        }   
        
    }
}
