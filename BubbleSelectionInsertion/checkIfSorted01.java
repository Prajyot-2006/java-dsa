// Ques : check if array is sorted or not 

public class checkIfSorted01 {
    public static void main(String[] args) {
        int arr[] = {5,1,3,7};
        boolean check = true;  // let assume arr is sorted 
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]) {
                check = false; // means arr is not sorted 
            }
        }
        System.out.println(check);  // result
    }
}
