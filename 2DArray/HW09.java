/*HW: Find the minimum element out of all the maximum elements of each row */

public class HW09 {

    public static int calculate(int brr[]) {
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<brr.length;i++) {
            if(brr[i]>max) {
                max = brr[i]; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3,2,5},{7,5,1,8},{9,1,2,6}};
        int rows = arr.length;
        int store[] = new  int[rows];
        for(int i=0;i<rows;i++) {
            int callFn = calculate(arr[i]);
            store[i] = callFn;
        }
        int min = Integer.MAX_VALUE;
        for (int i : store) {
            if(i<min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}