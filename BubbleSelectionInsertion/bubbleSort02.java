// Bubble sort : basic code example of bubble sort 

public class bubbleSort02 {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int arr[] = {3,5,1,4,2,0};
        int n = arr.length;  // 6 
        for(int i=1;i<=n-1;i++) {  // 1 to 5  Time Compplexity for outer loop - O(n-1)
            for(int j=0;j<n-1;j++) {  // Time Compplexity for inner loop - O(n-1)
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            print(arr);  // this o/p will be printed 5 times bcoz we require 5 rounds to sort this array
        }
    }
}
// No of opeartion - (n-1)(n-1)
// so Total Time Compplexity is - O(n^2)
