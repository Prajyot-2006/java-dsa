import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);
        // using built-in method 
        Collections.reverse(arr);
        System.out.println(arr);

        // using manual method(self-doing)
        int i=0;
        int j=arr.size() - 1;
        while(i<j) {
            int temp = arr.get(i);
        // arr.get(i) = arr.get(j);  // Wrong 
            arr.set(i, j);
            arr.set(j, temp);
            i++;
            j--;
        }
    }
}
