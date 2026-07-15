// this is kinda recursion 
// just dry run to understand clearly
public class infiniteCalling03 {

    public static void urahara() {
        System.out.println("Urahara");
        aizen();
    }

    public static void shinji() {
        System.out.println("Shinji");
        urahara();
    }

    public static void aizen() {
        System.out.println("Aizen");
        shinji();
    }

    public static void main(String[] args) {
        aizen();
    }
}
