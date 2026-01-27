// better/optimized version of bubble sort as compared to previous one 
// here in this code No of operation is less as compared to previous code so this is optimized version of bubble sort 
public class optimizeBubbleSort03 {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {

        int arr[] = {3,5,1,4,2,0};
        int n = arr.length;  // 6 
/*   this code is also optimized 

        boolean isSort = true;
// what if the arr is already sorted ? 
        for(int i=0;i<n-1;i++) {
            if(arr[i]>arr[i+1]){
                isSort = false;  // arr is not sorted 
                break;
            }
        }

        if(isSort==false) {  //if arr is not sorted then only we will enter into sorting algorithm or process , this will help reduce time
            for(int i=0;i<n-1;i++) {  // 0 to 4 which is 5 rounds,  Time Compplexity for outer loop - O(n-1)
                for(int j=0;j<n-1-i;j++) {  // Time Compplexity for inner loop - O(n-1)
                    if(arr[j]>arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                print(arr);  // this o/p will be printed 5 times bcoz we require 5 rounds to sort this array
            }
        }

*/
    
        // what if the arr is already sorted ? 
        for(int i=0;i<n-1;i++) {
            int swaps = 0;
            for(int j=0;j<n-1-i;j++) {  // we did j<n-1-i for not checking the sorted elements 
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);

    }
}
// No of opeartion - n(n-1)/2
// Time complexity will change for best case in this code which is : O(n) and avg case is : O(n^2)which is same as previous code, but this code will be speeder than previous one bcoz it is not checking the sorted elements 