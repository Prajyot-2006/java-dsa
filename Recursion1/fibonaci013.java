public class fibonaci013 {
    public static void main(String[] args) {
        int n = 3;
        int ans = fibo(n , 0 , 1);
        System.out.println(ans);

    }
    public static int fibo(int n , int a , int b) {
        if(a>=n) {
            return a;
        }
        System.out.print(a + " ");
        int temp = a;
        a = b;
        b = temp+b;
        

        int send = fibo(n,a,b);
        return send;
    }
}
