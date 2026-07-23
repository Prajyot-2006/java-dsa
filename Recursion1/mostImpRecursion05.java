// Ques : Print decreasing-increasing number

import java.util.Scanner;

public class mostImpRecursion05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a int : ");
        int n = sc.nextInt();
        shinji(n);  // 5
    }

    public static void shinji(int n) {
        if(n==1){  // this is known as base case , base case is used to end the recusrion
            System.out.println(n);
            return;
        }   
        System.out.println(n);
        shinji(n-1);
        System.out.println(n);
    }
}
