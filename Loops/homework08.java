// Ques: Display this GP - 1,2,4,8.. upto ‘n’ terms

import java.util.Scanner;

public class homework08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a = 1;
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        for(int i=1;i<=n;i++) {
            System.out.println(a);
            a = a * r; 
        }
    }
}
