// HW: Take ‘n’ as input from user and print the following sequence..
/*  
1   
n
2
n-1
3
n-2

...
*/
import java.util.Scanner;
public class homework09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int count = n;
        int a = 1;
        for(int i=1;i<=count;i++) {
            System.out.println(a);
            System.out.println(n);
            n--;
            a++; 
        }
    }
}
