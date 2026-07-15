// this is built-in function
public class impStringFnForHashMap05 {
    public static void main(String[] args) {
    String s = "dog cat cat dog";

    String[] words = s.split(" ");

    System.out.println(words[0]);
    System.out.println(words[1]);
    System.out.println(words[2]);
    System.out.println(words[3]);
    }
}

/*
split(" ") breaks a string into multiple parts using space (" ") as the separator.
It returns a String array.
*/