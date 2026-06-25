public class concat015 {
    public static void main(String[] args) {
        String s1 = "eren";
        String s2 = "mikasa";
        System.out.println(s1.concat(s2));
        s1.concat(s2);  // cannot happen
        s1 = s1.concat(s2);
        System.out.println(s1);

        // concating string without using concat fn 
        s1 = s1 + s2;
        System.out.println(s1);
    }
}
