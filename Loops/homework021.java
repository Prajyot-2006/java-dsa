// Ques: ‘a’ raise to the power ‘b’

import java.util.Scanner;

public class homework021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();   // 2

        System.out.print("Enter b : ");
        int b = sc.nextInt();   // 3
        int power = 1;
        for(int i=1;i<=b;i++) {  // loop will work only 3 times 
            power = power*a;  
        }
        System.out.println(power);
    }
}
