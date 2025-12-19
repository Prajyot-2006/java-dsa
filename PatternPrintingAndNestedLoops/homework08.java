/*
HW: Print the given pattern for n=4 print this  for n=6 aaaaaa and like that
aaaa
bbbb
cccc
dddd
*/

import java.util.Scanner;

public class homework08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int x = i + 96;
                char y = (char)x; 
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
