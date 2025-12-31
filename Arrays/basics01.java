// basics of array 

public class basics01 {
    public static void main(String[] args) {
        // initialization
        int []arr = {1 , 2 , 3 , 4};
        System.out.println(arr);  // will print its reference value

        // another way to initialize array 
        int[] arr1 = new int[7];  // this array has 7 elements and their default value is 0

        // indexing
        System.out.println(arr[0]);

        // updating element 
        arr[0] = 5;
        System.out.println(arr[0]);

        // printing length
        System.out.println(arr.length);

        // accesing every elements 
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // checking default value 
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]);
        }


    }
}