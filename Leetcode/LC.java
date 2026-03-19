import java.util.ArrayList;

public class LC {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        ArrayList<Integer> arrL = new ArrayList<>();
        int target = 8;
        int starting = -1;
        int ending = -1;
        boolean found = false;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                arrL.add(i);
            }
        }

        int ans[] = new int[2];

        for (Integer ele : arrL) {
            System.out.print(ele + " ");
        }
    }
}
