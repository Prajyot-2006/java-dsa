public class arrayParseReverse02 {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,7,9};
        Parse(arr , arr.length-1);
    }
    public static void Parse(int arr[] , int k) {
        if(k==-1) return;
        System.out.println(arr[k]);
        Parse(arr, k=k-1);  
    }

}
