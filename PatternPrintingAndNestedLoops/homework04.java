// Ques: Print the given pattern
/*  This question is about if n=4 then print this if n=3 then it should be upto ABC and like that
ABCD
ABCD
ABCD
ABCD
*/

import java.util.Scanner;

public class homework04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int x = j + 64;
                char y = (char)x;
                System.out.print(y);
            }
            System.out.println();
        }


    }
}
