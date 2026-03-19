// how to take input in 2D array
import java.util.Scanner;

public class takingInputIn2DArray03 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int rows = arr.length;
        int columns = arr[0].length;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
