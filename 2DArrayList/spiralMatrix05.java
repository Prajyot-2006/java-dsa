/*
1 2 3 
4 5 6
7 8 9 
soln : 1 2 3 6 9 8 7 4 5
*/

import java.util.ArrayList;

public class spiralMatrix05 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        int firstRow = 0;
        int lastRow = m-1;
        int firstCol = 0;
        int lastCol = n-1;
        int tne = m*n;
        while(ans.size()<=tne) {
            for(int i=firstCol;i<=lastCol;i++){
                ans.add(arr[firstRow][i]);
            }
            firstRow++;
            if(ans.size()==tne) break;
            for(int i=firstRow;i<=lastRow;i++){
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if(ans.size()==tne) break;
            for(int i=lastCol;i>=firstCol;i--){
                ans.add(arr[lastRow][i]);
            }
            lastRow--;
            if(ans.size()==tne) break;
            for(int i=lastRow;i>=firstRow;i--){
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }

        for (Integer ele : ans) {
            System.out.print(ele + " ");
        }
        

    }
}
