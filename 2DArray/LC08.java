/*Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.
In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

Return an array containing the index of the row, and the number of ones in it. 

Input: mat = [[0,1],[1,0]]
Output: [0,1]
Explanation: Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is [0,1].

Input: mat = [[0,0,0],[0,1,1]]
Output: [1,2]
Explanation: The row indexed 1 has the maximum count of ones (2). So we return its index, 1, and the count. So, the answer is [1,2].

Input: mat = [[0,0],[1,1],[0,0]]
Output: [1,2]
Explanation: The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].
*/

public class LC08 {

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
        int mat[][] = {{0,1},{1,0}};
        int rows = mat.length;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int store[] = new int[rows];
        int finalOutput[] = new int[2];

        for(int i=0;i<rows;i++) {
            int max1Row = calculate(mat[i]);
            store[i] = max1Row;  // 1,1
        }
        for(int i=0;i<store.length;i++) {
            if(store[i]>max) {
                max = store[i];
                maxIndex = i; 
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
        
        finalOutput[0] = max;
        finalOutput[1] = maxIndex;

        for(int i=0;i<finalOutput.length;i++) {
            System.out.print(finalOutput[i] + " ");
        }

    }
}
