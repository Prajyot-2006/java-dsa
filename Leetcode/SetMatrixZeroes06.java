import java.util.HashMap;

public class SetMatrixZeroes06 {
    public static void updateRow(int row , int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0;i<cols;i++) {
            arr[row][i] = 0;
        }
    }
    public static void updateCol(int col , int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0;i<rows;i++) {
            arr[i][col] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int rows = arr.length;
        int cols = arr[0].length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(arr[i][j]==0) {
                    map1.put(i,1);
                    map2.put(j,1);
                }
            }
        }
        for(int key : map1.keySet()) {  // row
            updateRow(key , arr);
        }
        
        for(int key : map2.keySet()) {  // col
            updateCol(key, arr);
        }
        for (int[] ele : arr) {
            for (int ele1 : ele) {
                System.out.print(ele1 + " ");
            }
            System.out.println();
        }

    }
}
