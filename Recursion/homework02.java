// Ques : Print n to 1


import java.util.Scanner;
public class homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a int : ");
        int n = sc.nextInt();
        shinji(n);  // 5
    }
    public static void shinji(int n) {
        if(n==0) return;  // this is known as base case , base case is used to end the recusrion
        System.out.println(n);
        shinji(n-1);
    }
}
