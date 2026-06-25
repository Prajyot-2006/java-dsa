import java.util.ArrayList;
import java.util.Collections;

public class StringCannotReverse03 {
    public static void main(String[] args) {
        // java doesnt support builtin method for string reverse 
        String s = "prajyot";
        // System.out.println(s.reverse());  in java we cant do like this
        // we can do it manually or either we can do it using string builder
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);

        // and string doesnt have built_in sort methd 
        String str = "bazd";
        System.out.println(str);
        ArrayList<Character> arr = new ArrayList<>();
        int length = str.length();
        for(int i=0;i<length;i++) {
            arr.add(str.charAt(i));
        }
        Collections.sort(arr);
        str = arr.toString();  // this converts just like arraylist o/p is [a, b, d, z] not abdz 
        System.out.println(str); 



    }
}
