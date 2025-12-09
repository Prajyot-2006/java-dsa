import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int left = 1;     // increasing number starting from 1
        int right = n;    // decreasing number starting from n

        while (left <= right) {
            System.out.println(left);  // print increasing number
            if (left != right) {
                System.out.println(right); // print decreasing number
            }
            left++;
            right--;
        }
    }
}
