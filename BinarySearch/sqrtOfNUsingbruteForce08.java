public class sqrtOfNUsingbruteForce08 {
    public static void main(String[] args) {
        int n = 4;
        int root = 0;
        for(int i=1;i<=n;i++) {
            if(i*i>=n) break;
            root = i;
        }
        System.out.println(root);
    }
}
