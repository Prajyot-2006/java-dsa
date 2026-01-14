/*You are given an array arr[] of size n - 1 (note : n is the actual size of array)that contains distinct integers in the range from 1 to n (inclusive). 
This array represents a permutation of the integers from 1 to n with one element missing. 
Your task is to identify and return the missing element. */

public class homework021 {

    public static int sum(int check) {
        check = check*(check+1)/2;
        return check;
    }

    public static int sumArr(int arr[]) {
        int total = 0;
        for(int i=0;i<arr.length;i++){  
            total = total + arr[i];
        }
        return total;
    }
    public static void main(String[] args) {

        // just read the question : it says an array of size n-1 that means the arrays size is n but we have to take size n-1 for finding the missing element 
        int arr[] = {1,3,2,5};  // so missing element is 4 
        int n =arr.length + 1;  // actual lenght of arr when we find the missing element

        int total = sum(n);  // 1 to n ka sum 
        int arrTotal = sumArr(arr);  // arr ke elements ka sum
        int found = total - arrTotal;  // 1 to n ka sum - arr ke elements ka sum = we will get the missing element
        System.out.println(found); 


        /* just pure maths ,suppose size of arr is 5 then the elements in the arr is from 1 to 5 and 1 to 5 ka sum 36 hota hai so in arr we have to sum its elements and minus it with the sum of 1 to n */


    }
}