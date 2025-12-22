// QUES : Print sum of digits of a number 
// n = 123 then ans is 1 + 2 + 3 = 6
// HINT : n%10 gives the last digit of any number n 
import java.util.Scanner;

public class homework017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();  // n = 123
        int sum = 0;
        int i = 1;
        while(n!=0) {
            int lastDigit = n%10;   // if n/10 removes the last digit then n%10 will give the exact last digit of n
            sum = sum + lastDigit;  
            n = n/10; // to remove the last digit after storing it in the sum variable or adding it in the sum variable
            i++;
        }
        System.out.println("The sum of digits is : "+sum);

    }
}
