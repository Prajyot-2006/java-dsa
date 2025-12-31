/*HW: Print product of elements of the
array. */

import java.util.Scanner;

public class homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];  // array is of 5 elements 
        System.out.println("Enter Array elements ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int product = 1;

        for(int i=0;i<arr.length;i++) {
            product = product*arr[i];
        }
        System.out.println("Product is : "+product);
    }
}
