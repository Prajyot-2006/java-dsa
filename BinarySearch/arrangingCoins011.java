// LC : 441. Arranging Coins
// here just solving √1+8n not entire k 
public class arrangingCoins011 {
    public static void main(String[] args) {
        int n = 8;
        long sqrt = 1L + 8L * n;  // we are converting in long , coz further in sqrt fn we gonna do mid*mid so that time even long can exceed the value
        // long sqrt = (long)1 + (long)8 * n;  can do like this as well
        long lo = 1;
        long hi = sqrt;
        long root = 0;
        while(lo<=hi) {
            long mid = (lo+hi)/2;  // we can do like this mid = lo + (hi-lo)/2;
            if(mid==sqrt/mid) {
                root = mid;
                break;
            }
            else if(mid > sqrt/mid) {
                hi = mid - 1;
            }
            else {
                root = mid;
                lo = mid + 1;
            }
        }
        System.out.println((int)root);  // typecasting
    }
}