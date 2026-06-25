public class PassingStringInFunction06 {

    public static void change(String s) {
        s = "Pranav";
    }


    public static void main(String[] args) {
        String s = "Prajyot";
        System.out.println(s);
        change(s); 
        System.out.println(s);
    }
}
