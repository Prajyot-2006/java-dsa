public class StringsAreImmutable011 {
    public static void main(String[] args) {
        // we cannot update a particular index value of a string
        String s = "prajyot";
        // s.charAt(0) = "k";  // cant do that
        System.out.println(s);
        System.out.println(s.hashCode());

        // but we can update the whole string (but it creates a new string)
        s = "raj";
        System.out.println(s);
        System.out.println(s.hashCode());

        // so basically the string where we stored prajyot its memory code(hash code) is different and the string where we stored raj its memory code(hash code) is different , however their name is same
        // dont worry about this shit , just assume that ki og string hi update hua hai coz this concept is not much imp (i guess)
    }
}