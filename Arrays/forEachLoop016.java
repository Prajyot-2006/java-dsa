/* foreach is only used to traverse the array not to update the array */

public class forEachLoop016 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for (int ele : arr) { // array ke element ki ek copy banti hai ek ele nam ka dabba bana fir usme arr[0] , arr[1] aaya
            System.out.print(ele+" ");
        }
        for (int ele : arr) {  // we cant do this or we cant update the original array
            ele = ele * 2;
        }
        for (int ele : arr) {  // bcz ye jo ele hai ye array ke element ki copy banti hai 
            System.out.print(ele+" ");
        }
    }
}
