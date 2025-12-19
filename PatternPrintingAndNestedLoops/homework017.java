/*
Ques: Print the given pattern for n=4 
AAAA
BBB
CC
D
*/

import java.util.Scanner;

public class homework017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int store = n;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=store;j++) {
                int x = i+64;
                char y = (char)x;
                System.out.print(y);
            }
            store--;
            System.out.println();
        }


    }
}
