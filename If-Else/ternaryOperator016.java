// Ques : if n value is positive then store 100 in store varaibable and if n value is negative then store 0 in store variable
// if we want to store something using ternary operator then we do like this 
import java.util.Scanner;

public class ternaryOperator016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

/*      // using If-Else
        int store;
        
        if(n>0) store = 100;
        else store = 0;
*/

        // using Ternary Operator : (condition) ? sach : jhoot
        int store = (n>0) ? 100 : 0; 
        
    }
}
