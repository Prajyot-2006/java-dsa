// Ques: Display this AP - 2,5,8,11.. upto ‘n’ terms

import java.util.Scanner;

public class homework06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Enter d : ");
        int d = sc.nextInt();

        for(int i=2;i<=3*n-1;i=i+d) {
            System.out.println(i);
        }

    }
}
