

public class printing2DArray02 {
    public static void main(String[] args) {
        
        int arr[][] = {{2,1,3,4},{5,4,7,2},{8,3,1,6},{9,4,3,5}};
        int rows = arr.length;
        int columns = arr[0].length;
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
