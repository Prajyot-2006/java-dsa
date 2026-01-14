/*Ques: Given an Array, print negative
elements only */

import java.util.Scanner;
             
public class homework03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];  // array is of 5 elements 
        System.out.println("Enter Array elements ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++) {
            if(arr[i]<0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
