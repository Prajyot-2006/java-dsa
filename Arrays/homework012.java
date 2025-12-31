/*Ques: Multiply odd indexed elements by
2 and add 10 to even indexed elements */
import java.util.Scanner;



public class homework012 {

    public static void newArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            if(i%2==1) {  // odd index
                arr[i] = arr[i]*2;
            }
            else {
                arr[i] = 10 + arr[i];
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("Enter array elements here : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(+arr[i] + " ");
        }

        System.out.println("");

        newArray(arr);
    }
}