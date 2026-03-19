public class printing2DArray01 {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];  // {{0,0,0,0} , {0,0,0,0} , {0,0,0,0}}
        // we print 2D Arrays with the help of Nested Loops(just like pattern printing questions) where i is row and j is column
        for(int i=0;i<3;i++) {  // rows 
            for(int j=0;j<4;j++) {  // column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println(arr.length);  // This gives no of rows because it is array of arrays
        System.out.println(arr.length + "" + arr[0].length);  // and if we wanna print no of columns size so we do this 


    }
}