public class mostImpDryRun011 {
    public static void main(String[] args) {
        fun(1);
    }

    public static void fun(int n) {

        if(n == 3) {
            System.out.println("End " + n);
            return;
        }

        System.out.println("Start " + n);

        fun(n + 1);       // CALL 1

        System.out.println("Middle " + n);

        fun(n + 1);       // CALL 2
    }
}
