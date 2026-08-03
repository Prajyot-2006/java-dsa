public class lastOccurence03 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,5,5,5,5,6,7,8,11};
        int lo = 0;
        int hi = arr.length-1;
        int target = 5;
        int store = -1;
        while(lo<=hi) {
            int mid = (lo+hi)/2;
            // if(mid==lo) break;
            if(arr[mid]<target) {
                lo = mid+1;
            }
            else if(arr[mid]>target) {
                hi = mid-1;
            }
            else if(arr[mid]==target) {
                store = mid;
                lo = mid+1;
            }
        }
        System.out.println(store);
    }
}
