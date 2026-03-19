public class searchIn2D04 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,6,2},{7,6,2}};
        int rows = arr.length;
        int col = arr[0].length;
        int target = 9;
        boolean store = false;
        for (int i=0;i<rows;i++) {
            for(int j=0;j<col;j++) {
                if(arr[i][j]==target) {
                    store = true;
                }
            }
            System.out.println();
        }
        System.out.println(store);

    }
}
