
import java.util.ArrayList;
import java.util.Collections;

public class HWanagram05 {
    public static void main(String[] args) {
        String s = "prajyot";
        String t = "rajyopt";
        int sLength = s.length();
        int tLength = t.length();
        boolean result = false;
        ArrayList<Character> arr = new ArrayList();
        ArrayList<Character> arr1 = new ArrayList();
        if(sLength!=tLength) result = false;
        for(int i=0;i<sLength;i++) {
            arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        for(int i=0;i<tLength;i++) {
            arr1.add(t.charAt(i));
        }
        Collections.sort(arr1);
        System.out.println(arr);
        System.out.println(arr1);
        result = arr.equals(arr1);
        System.out.println(result);
        

    }
}
