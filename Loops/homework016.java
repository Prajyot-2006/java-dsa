// Ques: Count digits of a number

import java.util.Scanner;

public class homework016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        if(n==0) n = 1;  // put any 1 digit 
        int i = 1;
        while(n!=0) {  // n = 10 
            n = n/10;
            count++;
            i++;
        }
        System.out.println("Count is "+count);
    }
}
