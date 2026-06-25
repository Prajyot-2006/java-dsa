public class manualChecking023 {
    public static boolean equals(String s1 , String s2) {
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "prajyot";
        String s2 = "prajyot";
        // this is manual method we have made a fn by ourself to check whether the strings are smae or not
        boolean check = equals(s1,s2);
        System.out.println(check);
        // this is built-in method
        System.out.println(s1.equals(s2));
    }
}
