// you havent modify the rows , u just used correct logic in for loop to print reverse rows (arr is not updated)
public class reverseRowsHW013 {
    public static void main(String[] args) {
        int arr[][] = {{2,1,3,8},{4,3,1,2},{7,9,8,2}};
        int rows = arr.length;
        int colums = arr[0].length;
        for(int i=0;i<rows;i++) {
            for(int j=colums-1;j>=0;j--) {  // for i=0 , j->2 1 3 8 bcz j is going from 0 to 3 hence for i=1 , j->4 3 1 2
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        // original 2D array is this : 
        for (int ele[] : arr) {  // ele = arr[0] , arr[1] , arr[2] , arr[3]
            for (int element : ele) {  // element = ele 
                System.out.print(element + " ");
            }
            System.out.println("");
        }


    }
} // 8 3 1 
/*
  0 1 2 3
0 2 1 3 8
1 4 3 1 2
2 7 9 8 2
*/