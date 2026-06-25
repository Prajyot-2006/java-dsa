// s1.equals(s2)
public class stringEqual022 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2));  // it compares both strings character byu character
    }
}
