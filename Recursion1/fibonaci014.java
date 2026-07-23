// find the nth fibonaci number 
// f(0)=0 f(1)=1 f(2)=1 f(3)=2 

public class fibonaci014 {
    public static void main(String[] args) {
        int n = 3;
        int ans = nthFibo(n);
        System.out.println(ans);
    }
    public static int nthFibo(int n) {
        if(n<=1) return n;
        int send = nthFibo(n-1) + nthFibo(n-2);
        return send;
    }
}
