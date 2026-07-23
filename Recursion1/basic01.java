public class basic01 {
    public static void main(String[] args) {
        shinji(1);
    }

    public static void shinji(int n) {
        if(n==5) return;
        System.out.println("Orihime");
        shinji(n+1);

    }
}
