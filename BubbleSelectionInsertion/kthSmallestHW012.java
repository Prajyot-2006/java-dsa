
/*Given an integer array arr[] and an integer k, your task is to find and return the kth smallest element in the given array.

Note: The kth smallest element is determined based on the sorted order of the array */

public class kthSmallestHW012 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,99,9,6,3,2,1,5};   
        int n = arr.length;  // 5
        int k = 4;   // 1,1,2,2,99,9
          // 1,2,3,5,
        for(int i=0;i<k;i++) { // this loop will run k times bcoz we wanna find kth smallest element means k baar hame minimum element ko dhundna hai , in 1st iteration we will get 1st min and in 2nd iteration we get 2nd min so in kth iteration we get kth min 
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i;j<n;j++) {
                if(arr[j]<min) {
                    min = arr[j];  // u got 1 
                    mindex = j;  
                }
            }
            // swap the min with the 1st element of array 
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;

        }
        System.out.println(arr[k-1]);
    }
}
