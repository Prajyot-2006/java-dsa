public class sumOf1ton09 {
    public static void main(String[] args) {
        int n = 5;  // -5-4-3-2-1+0+1 
        int ans = sum(n);
        System.out.println(ans);
    }
    public static int sum(int n) {
        if(n==0) return 0;
        int send = n + sum(n-1);
        return send;
    }
}