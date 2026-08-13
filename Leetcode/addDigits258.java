public class addDigits258 {
    public static void main(String[] args) {
        int n = 29;
        int count = 0;

        while(n>0) {
            int last = n%10;
            count = count + last;
            n = n/10;
        }
        System.out.println(count);
        
    }
}