// Ques: Print the given pattern
/*  This question is about if n=4 then print this if n=3 then it should be upto 123 and like that
1234
1234
1234
1234
*/

import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}