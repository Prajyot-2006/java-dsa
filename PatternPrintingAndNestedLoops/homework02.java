
import java.util.Scanner;

// Ques: Print the given pattern
/*  This question is about if n=2 then print 2x2 matrix if n=3 then print 3x3 matrix
****
****
****
****
*/

public class homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {  // this loops is for kitni lines hogi for each and every question
            for(int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
