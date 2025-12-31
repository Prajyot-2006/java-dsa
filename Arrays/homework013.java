/*Ques: Search in Array */

import java.util.Scanner;

public class homework013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5]; 
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number to find : ");
        int number =sc.nextInt();
        boolean flag = false;  // false means element array me nahi hai
        int index = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == number) {
                flag = true;
                index = i;
                break;
            }
            else {
                flag = false;
            }
        }

        if(flag == true) {
            System.out.println("Number found at index : "+index);
        }
        else {
            System.out.println("Not Found");
        }

    }
}