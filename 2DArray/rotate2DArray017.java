public class rotate2DArray017 {

    public static int[] reverse(int store[]) {
        int i=0;
        int j=store.length-1;
        while(i<j) {
            int temp = store[i];
            store[i] = store[j];
            store[j] = temp;
            i++;
            j--;
        }
        return store;  // memory address
    }

    public static void main(String[] args) {
        int arr[][] = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        int rows = arr.length;
        int columns = arr[0].length;
        // Transpose matrix
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                if(j>i) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        System.out.println(arr[0]); //  arr[0] is an array and if we print it directly we will get its memory address 
        for(int i=0;i<rows;i++) {
            int brr[] = reverse(arr[i]);  // arr[i] is an array and we are sending a memory address to the reverse function
        }

        for (int ele[] : arr) {  
            for (int element : ele) { 
                System.out.print(element + " ");
            }
            System.out.println("");
        }



    }
}
