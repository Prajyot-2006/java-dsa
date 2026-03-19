public class dryrun {
    public static void main(String[] args) {
        int arr[][] = {{2,8,3},{7,2,1},{5,5,4}};
        int columns = arr.length;
        int rows = arr[0].length;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i==j) {
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }


    }
}
