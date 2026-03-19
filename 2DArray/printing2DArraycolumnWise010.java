// we gonna print 2D Array column wise not gonna update the 2d array entirely  

public class printing2DArraycolumnWise010 {
    public static void main(String[] args) {
        int arr[][] = {{2,1,3,4},{5,4,7,2},{8,3,1,6}};
        int rows = arr[0].length;
        int columns = arr.length;
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
/*

2 1 3 4
5 4 7 2
8 3 1 6

2 5 8
1 4 3
3 7 1
4 2 6
*/