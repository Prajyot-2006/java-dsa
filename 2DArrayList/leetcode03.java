// LC question no : 119

import java.util.ArrayList;
import java.util.List;

public class leetcode03 {

    public static void main(String[] args) {

        List< List<Integer> > arr = new ArrayList<>();  // 2d AL
        int rowSize = 3;
        int n = rowSize+1;
        for(int i=0;i<n;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(i==j || j==0) {
                    row.add(1);
                }
                else {
                    row.add(0);
                }
            }
            arr.add(row);
        }
        for(int i=2;i<arr.size();i++) {
            for(int j=1;j<i;j++) {
                int value = arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                arr.get(i).set(j, value);
            }
            System.out.println();
        }
        //System.out.print(arr);
        System.out.print(arr.get(rowSize));
    }
}

/*
rowindex = 4;
n=rowindex+1  ; n=4+1 = 5
1
1 1
1 1 1
1 1 1 1
1 1 1 1 1
*/
