/*
break : Stops the loop completely.
continue : Skips the particular iterations step and moves to the next one.
*/
// Ques: WAP to check if a given number is prime or not.


import java.util.Scanner;

public class homework012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        boolean check = true;  // true means no is prime

        for(int i=2;i<=n-1;i++) {  // why loop starts from 2 to n-1 ? bcoz we already know any numbers factor are 1 and the number itself for eg : 6 ka factor 1 aur 6 toh rahega hi so thats why we aint checking 1 and n in the loop we are checking from 2 to n-1 instead 
            if(n%i==0) {
                check = false; // false means no is composite 
                break;
            }      
        }
        if(n==1) {
            System.out.println("Nor Prime Nor Composite");
        }

        else if(check == true) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime its a Composite");
        }

    }
}
