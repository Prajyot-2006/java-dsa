public class noOfWays015 {
    public static void main(String[] args) {
        int n = 5;
        int ans = stairs(n);
        System.out.println(ans);
    }
    public static int stairs(int n) {
        if(n==1) return n;
        if(n==2) return n;
        int send = stairs(n-1) + stairs(n-2);
        return send;
    }
}
