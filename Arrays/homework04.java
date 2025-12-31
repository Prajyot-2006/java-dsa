// Ques: Print sum of elements of the array.

import java.util.Scanner;

public class homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];  // creating array of 5 elements 
        System.out.println("Enter Array elements ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();  // taking input
        }

        int sum = 0;

        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
