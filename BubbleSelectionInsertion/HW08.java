/* Selection Sort : find the largest element and swap it with last element and sort according to this process */

public class HW08 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,8,9,6};
        int n = arr.length;  // 7
        
        for(int i=n-1;i>0;i--) { //  
            int max = Integer.MIN_VALUE;  // -999
            int maxindex = -1;
            for(int j=i;j>=0;j--) {
                if(arr[j]>max) {
                    max = arr[j];  // u got 9
                    maxindex = j;  
                }
            }
            // swap the min with the 1st element of array 
            arr[maxindex] = arr[i];
            arr[i] = max;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
