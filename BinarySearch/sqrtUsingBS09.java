public class sqrtUsingBS09 {
    public static void main(String[] args) {
        int n = 8;
        long lo = 1;
        long hi = n;
        long root = 0;
        while(lo<=hi) {
            long mid = (lo+hi)/2;  // we can do like this mid = lo + (hi-lo)/2;
            if(mid*mid==n) root = mid;
            else if(mid*mid>n) {
                hi = mid-1;
                root = hi;
            }
            else if(mid*mid<n) {
                lo = mid+1;
            }
        }
        System.out.println((int)root);
    }
}
