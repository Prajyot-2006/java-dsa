/*
break : Stops the loop completely.
continue : Skips the particular iterations step and moves to the next one.
*/
// Ques: WAP to check if a given number is prime or not.

// first we will learn about composite numbers : so WAP to check if a given number is composite or not.
// composite simply means the no which has 2 factors 
import java.util.Scanner;

public class breakStatement011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = sc.nextInt();

        for(int i=2;i<=n-1;i++) {  // why loop starts from 2 to n-1 ? bcoz we already know any numbers factor are 1 and the number itself for eg : 6 ka factor 1 aur 6 toh rahega hi so thats why we aint checking 1 and n in the loop we are checking from 2 to n-1 instead 
            if(n%i==0) {
                System.out.println("Composite number : "+i);
                break;
            }           
        }

        for(int i=1;i<=10;i++) {  // we can also use break in the for loop without using if statement its not that we can only use break and continue only inside if statement
            System.out.println("Annie");
            break;
        }

    }
}