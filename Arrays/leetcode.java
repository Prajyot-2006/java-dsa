import java.util.ArrayList;
import java.util.Collections;

public class leetcode {
    public static void main(String[] args) {
        int nums1[] = {1,2,4,4};
        int nums2[] = {2,4,3};
        ArrayList<Integer> arr = new ArrayList<>();
        int valid=0;


            for(int i=0;i<nums1.length;i++) {
                for(int j=0;j<nums2.length;j++) {
                    if(nums1[i]==nums2[j]) {
                        arr.add(nums1[i]);
                    }
                }
            }
            valid++;
        

        Collections.sort(arr);
        // need to sort for using this logic 
        for(int i = 0; i < arr.size() - 1; ) {
            if(arr.get(i).equals(arr.get(i+1))) {
                arr.remove(i+1);
            } else {
                i++;
            }
        }

        for (Integer ele : arr) {
            System.out.print(ele + " ");
        }
        int result[] = new int[arr.size()];
        for(int i=0;i<result.length;i++) {
            result[i] = arr.get(i);
        }

    }
}
