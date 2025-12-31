/*We will use scanner or take input of array elements from user and solve the problem */

// Ques: same Previous Question 
import java.util.Scanner;

public class updateOf014file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter Array elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        boolean flag = false;

        int indexI = -1;
        int indexJ = -1;

        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<arr.length-1;j++) {
                if(arr[i] + arr[j] == target) {
                    flag = true;
                    indexI = i;
                    indexJ = j;
                    if(i==j) {
                        flag = false;
                    }
                }
            }
        }

        if(flag) {
            System.out.println("Found Two elements whose sum is the target, check index : "+indexI+" , "+indexJ);
        }
        else {
            System.out.println("Not Found any Two elements whose sum can be "+target);
        }


    }
}