public class reverseArrayUsingRecursion07 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        int send[] = rev(arr,i,j);
        for (int ele : send) {
            System.out.print(ele + " ");
        }
    }
    public static int[] rev(int arr[] , int i , int j) {
        if(i>=j) return arr;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return rev(arr, i+1, j-1);
    }
}
