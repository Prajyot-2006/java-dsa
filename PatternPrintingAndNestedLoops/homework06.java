/*
HW: Print the given pattern for n=4 print this  for n=6 111111 and like that
1111
2222
3333
4444
*/

import java.util.Scanner;

public class homework06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
