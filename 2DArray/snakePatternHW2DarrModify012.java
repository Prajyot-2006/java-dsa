/*
2 8 3 4 7 
7 2 1 6 3   
5 5 4 1 4 
3 1 8 2 6

ANS : 2 8 3 4 7 
      3 6 1 2 7 
      5 5 4 1 4 
      6 2 8 1 3
*/

public class snakePatternHW2DarrModify012 {

    public static int[] reverse(int brr[]) {
        // brr = 7 2 1 6 3
        int k=0;
        int p=brr.length-1;
        while(k<p) {
            int temp = brr[k];
            brr[k] = brr[p];
            brr[p] = temp;
            k++;
            p--;
        }
        return brr;
    }



    public static void main(String[] args) {
        int arr[][] = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int rows = arr.length;
        int columns = arr[1].length;
        for(int i=0;i<arr.length;i++) {
            if(i%2==1) {
                int brr[] = reverse(arr[i]);  /// arr[i] is an array and we are sending a memory address to the reverse function
                for (int ele : brr) {
                    System.out.print(ele + " ");
                }
            }
            else {
                for (int ele : arr[i]) {
                    System.out.print(ele +" ");
                }
            }
           // System.out.println("");
        }
        System.out.println("");
        System.out.println("OG ARray : ");
        for (int ele[] : arr) {  // ele = arr[0] , arr[1] , arr[2] , arr[3]
            for (int element : ele) {  // element = ele 
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }
}