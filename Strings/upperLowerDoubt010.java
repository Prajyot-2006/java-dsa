public class upperLowerDoubt010 {
    public static void main(String[] args) {
        String s = "hii";
        System.out.println(s.toUpperCase());  
        System.out.println(s);  // this is original String 's' and it didnt change 
        // same applies to lowercase fn as well 

        // so to completely change the string 
        s = s.toUpperCase();
        System.out.println(s);
    }
}