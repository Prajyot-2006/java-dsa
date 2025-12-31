
import java.util.Arrays;

// sorting array using built-in methods 

public class sort011 {

    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        int arr[] = {2,-3,4,5,-7};
        print(arr);
        Arrays.sort(arr);  // arr is sorted succesfully
        print(arr);
    }
}