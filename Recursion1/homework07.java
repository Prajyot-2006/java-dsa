// Ques : a to the power b 

import java.util.Scanner;

public class homework07 {
    static int a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int ans = power(b);  // 3
        System.out.println(ans);
    }
    public static int power(int b) {
        if(b==0) return 1;
        int send = a*power(b-1);
        return send;
    }
}
