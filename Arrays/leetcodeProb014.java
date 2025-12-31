// Ques: Two Sum 
import java.util.Scanner;

public class leetcodeProb014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1 , 5 , 8 , -3};
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