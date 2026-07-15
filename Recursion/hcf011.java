public class hcf011 {
    public static void main(String[] args) {
        int a = 763;
        int b = 441;
        while(b%a!=0) {
            int rem = b%a;  // 105
            b = a;  // 175
            a = rem;  // 105
        }
        System.out.println(a);
    }
}
