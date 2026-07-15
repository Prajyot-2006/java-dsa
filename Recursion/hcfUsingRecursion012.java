public class hcfUsingRecursion012 {
    public static void main(String[] args) {
        int a = 763;
        int b = 441;
        int ans = hcf(a,b);
        System.out.println(ans);
    }
    public static int hcf(int a , int b) {
        if(b%a==0) {
            return a;
        }
        int rem = b%a;
        b = a;
        a = rem;
        int send = hcf(a,b);  // chota a rehta hai bada b rehta hai like b/a 
        return send;
    }

}
