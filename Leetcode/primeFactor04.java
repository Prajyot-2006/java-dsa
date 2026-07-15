
import java.util.ArrayList;

public class primeFactor04 {
    public static void main(String[] args) {
        int n = 30;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                // System.out.println(i + " ");
                arr.add(i);
                n = n / i;
            }
        }
        System.out.println(arr);
    }
}



