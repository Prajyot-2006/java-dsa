public class arrayParseReverseImp03 {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,7,9};
        Parse(arr , 0);
    }
    public static void Parse(int arr[] , int k) {
        if(k==arr.length) return;
        // Parse(arr, k=k+1); // out of bound 
        Parse(arr, k+1);
        System.out.println(arr[k]);
    }

}
