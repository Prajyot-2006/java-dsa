public class forEachLoop2DArray011 {
    public static void main(String[] args) {
        int arr1D[] = {1,2,3};
        System.out.println(" This is 1D Array : ");
        for (int ele : arr1D) {
            System.out.print(ele + " ");
        } 
        System.out.println("");
        System.out.println("");
        int arr2D[][] = {{2,4,6,4},{1,2,3,1},{5,7,8,6}};
        System.out.println(" This is 2D Array : ");
        // 1st method to print 2D array using foreach
        for(int i=0;i<arr2D.length;i++) {
            for (int ele : arr2D[i]) {  // it will parse the full array i.e arr2D[0] and son on for others eg : arr2D[1] , arr2D[2]
                System.out.print(ele + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println(" This is 2D Array : ");
        // 2nd method to print 2D array using foreach
        for (int ele[] : arr2D) {  // ele = arr[0] , arr[1] , arr[2] , arr[3]
            for (int element : ele) {  // element = ele 
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }
}
