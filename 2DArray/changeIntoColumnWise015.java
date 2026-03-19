/*Transpose of 2d array : transpose can only possible in square matrix  */
public class changeIntoColumnWise015 {

    public static void main(String[] args) {
        int arr[][] = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        int columns = arr.length;
        int rows = arr[0].length;
        // before updation 
        for (int ele[] : arr) {  // ele = arr[0] , arr[1] , arr[2] , arr[3]
            for (int element : ele) {  // element = ele 
                System.out.print(element + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        // Modify array using if condition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j > i) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        // Print updated array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*  wrong method : dryn run this as well
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
*/