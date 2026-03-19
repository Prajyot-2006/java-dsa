/*You are given a 2D binary array arr[][] consisting of only 1s and 0s. 
Each row of the array is sorted in non-decreasing order. 
Your task is to find and return the index of the first row that contains the maximum number of 1s. 
If no such row exists, return -1. */

public class GFG07 {

    public static int calculate(int brr[]) {
        int count1 = 0;
        for(int i=0;i<brr.length;i++) {
            if(brr[i]==1) {
                count1++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,0,1},{1,0,1,0},{0,0,0,0}};
        int max1 = Integer.MIN_VALUE; 
        int max1Id = -1;
        int rows = arr.length;
        int columns = arr[0].length;
        for(int i=0;i<rows;i++) {
            int rowMax1 = calculate(arr[i]);
            if(rowMax1>max1) {
                max1 = rowMax1;
                max1Id = i;
            }
        }
        System.out.println(max1);
        System.out.println(max1Id);
    }
}