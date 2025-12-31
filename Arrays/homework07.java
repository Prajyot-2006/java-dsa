/*Ques: Print the Minimum element in
the array */

import java.util.Scanner;

public class homework07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];  // array is of 5 elements 
        System.out.println("Enter Array elements ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }  
        int min = arr[0];  

        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min) min = arr[i];
        }
        System.out.println("Min : "+min);

    }
}
