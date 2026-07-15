// Ques : Print 1 to n

import java.util.Scanner;

public class homeworkUsingStatic03 {
    static int x = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        print(n);
    
    }
    public static void print(int n) {
        if(x>n) return;
        System.out.println(x);
        x++;
        print(n);
    }
}
