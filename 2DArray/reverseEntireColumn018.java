// we gonna modify the entire 2d array

public class reverseEntireColumn018 {
    public static void main(String[] args) {
        int arr[][] = {{1,3,2},{5,7,8},{9,3,1},{6,3,8}};
        int rows = arr.length;
        int columns = arr[0].length;

        System.out.println("");
        for(int i=0;i<rows;i++) {
            int stCol = 0; 
            int endCol = columns-1;
            while(stCol<endCol) {
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }
        for (int ele[] : arr) {  
            for (int element : ele) {  
                System.out.print(element + " ");
            }
            System.out.println("");
        }

    }
}
/*
        for (int ele[] : arr) {  // ele = arr[0] , arr[1] , arr[2] , arr[3]
            for (int element : ele) {  // element = ele 
                System.out.print(element + " ");
            }
            System.out.println("");
        }
*/