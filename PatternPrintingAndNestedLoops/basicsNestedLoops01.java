/*  Nested Loops - loop ke andar loop
Ques: Print the given pattern
* * * * *
* * * * *
* * * * *

*/

import java.util.Scanner;

public class basicsNestedLoops01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter columns : ");
        int columns = sc.nextInt();

        for(int i=1;i<=rows;i++) {  // this loops is for kitni lines hogi in each and every question
            for(int j=1;j<=columns;j++) {  // this loops is for har line me kitna print hoga
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
