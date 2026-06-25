public class StringCompareTo013 {
    public static void main(String[] args) {
        String s1 = "prajyot";  
        String s2 = "pranav";
        System.out.println(s1.compareTo(s2));  // it compares ascii value of 1st character only

        String b1 = "praju";
        String b2 = "peren";
        System.out.println(b1.compareTo(b2));  // is 1st charater are same it moves forward to check second character 

        String a1 = "harsh";
        String a2 = "harshit";
        System.out.println(a1.compareTo(a2));

    }
}

/*
String.compareTo() compares two strings character by character using Unicode/ASCII values.
*/