public class BS704 {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int target = 100;
        int lo = 0;
        int hi = arr.length-1;
        int send = search(arr,target,lo,hi);
        System.out.println(send);
        
    }
    public static int search(int arr[], int target, int lo, int hi) {

        if (lo > hi)
            return -1;

        int mid = (lo + hi) / 2;

        if (arr[mid] == target)
            return mid;

        else if (arr[mid] > target)
            return search(arr, target, lo, mid - 1);

        else
            return search(arr, target, mid + 1, hi);
    }
}