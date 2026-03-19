public class TransposeMatrix016 {
    public static void main(String[] args) {
        int arr[][] = {{2,1,3},{3,1,2}};
        int rows = arr.length;
        int columns = arr[0].length;
        int transpose[][] = new int[columns][rows];

        for(int i=0;i<transpose.length;i++) {
            for(int j=0;j<transpose[0].length;j++) {
                // transpose[j][i] = arr[i][j];
                transpose[i][j] = arr[j][i];
            }
        }
        for (int ele[] : transpose) {
            for (int element : ele) {
                System.out.print(element + " ");
            }
            System.out.println("");
        }
        


    }
}
/*
1st matrix : 
2 1 3
3 1 2

2nd matrix : 
2 3 
1 1
3 2 
*/