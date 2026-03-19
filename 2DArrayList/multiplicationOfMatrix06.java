/*
Multiplication of two matrices A and B is possible if:
Number of columns of A = Number of rows of B
*/

public class multiplicationOfMatrix06 {

    public static void main(String[] args) {
        int a[][] = {{1,2},{3,4}};
        int b[][] = {{5,6},{7,8}};
          // Result matrix size = (rows of first matrix) × (columns of second matrix)
        int n = a.length;
        int c[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<n;k++) {
                    c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
                }
            }
        }
        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[0].length;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
