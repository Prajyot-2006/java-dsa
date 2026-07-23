public class arrayParseUsingRecursion01 {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,7,9};
        Parse(arr , 0);
    }
    public static void Parse(int arr[] , int k) {
        if(k==arr.length) return;
        System.out.println(arr[k]);
        Parse(arr, k=k+1);  // here use k=k+1 not k++ , it will give infinite loop
    }

}
