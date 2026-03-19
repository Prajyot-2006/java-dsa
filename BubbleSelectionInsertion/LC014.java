
import java.util.Arrays;

/*Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting? */

public class LC014 {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};  // 1,2,3,4,5,6  ans =5
        int k=2;
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);  
        
    }
}
