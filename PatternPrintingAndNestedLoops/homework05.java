/*
HW: Print the given pattern for n=4 print small alphabets 
abcd
abcd
abcd
abcd
*/

import java.util.Scanner;

public class homework05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int x = j + 96;
                char y = (char)x;
                System.out.print(y);
            }
            System.out.println();
        }


    }
}

