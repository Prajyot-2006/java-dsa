
public class binarySearch01 {
    public static void main(String[] args) {
    int arr[] = {2,5,7,9,100,4005};
    int target = 7;
        int lo = 0;
        int hi = arr.length-1;
        int send = -1;
        while(lo<=hi) {
            int mid = (lo+hi)/2;
            if(arr[mid]<target) {
                lo = mid+1;
            }
            else if(arr[mid]>target) {
                hi = mid - 1;
            }
            else if(arr[mid]==target) {
                send = mid;
                break;
            }
        }
        System.out.println(send);
    }

}
