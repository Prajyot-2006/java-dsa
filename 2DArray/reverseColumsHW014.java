public class reverseColumsHW014 {
    public static void main(String[] args) {
        int arr[][] = {{2,1,3,8},{4,3,1,2},{7,9,8,2}};
        int rows = arr[0].length;
        int colums = arr.length;
        for(int i=0;i<rows;i++) {
            for(int j=colums-1;j>=0;j--) {  
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }
    }
}  // 2 3 1 2
/*
  0 1 2
0 2 4 7
1 1 3 9
2 3 1 8
3 8 2 2

8 2 2
3 1 8
1 3 9
2 4 2
*/