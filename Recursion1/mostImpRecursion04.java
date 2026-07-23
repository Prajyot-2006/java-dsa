// Ques : Print 1 to n , this is actually n to 1 we have just kept the sout after fn call

import java.util.Scanner;

public class mostImpRecursion04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a int : ");
        int n = sc.nextInt();
        shinji(n);  // 5
    }
    
    public static void shinji(int n) {
        if(n==0) return;  // this is known as base case , base case is used to end the recusrion
        shinji(n-1);
        System.out.println(n);
    }
}
