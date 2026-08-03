public class binarySearchIndescendingOrder05 {
    public static void main(String[] args) {
        int arr[] = {50,30,29,28,20,10,8};
        int tar = 10;
        int lo = 0;
        int hi = arr.length - 1;
        int store = -1;
        while(lo<=hi) {
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) {
                lo = mid + 1;
            }
            else if(arr[mid]<tar) {
                hi = mid - 1;
            }
            else if(arr[mid]==tar) {
                store = mid;
                break;
            }
        }
        System.out.println(store);
    }
}
