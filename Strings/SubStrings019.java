public class SubStrings019 {
    public static void main(String[] args) {
        String s = "prajyot";
        System.out.println(s.substring(0));  // 0 se last tak 
        System.out.println(s.substring(1));  // 1 se last tak
        System.out.println(s.substring(2));
        System.out.println(s.substring(3));

        System.out.println(s.substring(1,4));  // 1 se 4-1 tak
        int length = s.length();
        System.out.println(s.substring(0,length));

    }
}
