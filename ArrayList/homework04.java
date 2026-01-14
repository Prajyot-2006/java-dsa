
import java.util.ArrayList;
import java.util.Collections;

public class homework04 {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[] = {1,3,4};
        int n = arr.length;
        int carry = 1;
        for(int i=n-1;i>=0;i--) {
            if(arr[i]+carry<=9) {
                ans.add(arr[i]+carry);
                carry=0;
            }
            else {
                ans.add(0);
                carry = 1;
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
