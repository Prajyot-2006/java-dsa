/*
448. Find All Numbers Disappeared in an Array
*/
import java.util.ArrayList;
import java.util.Arrays;

public class FreqArrayleetcode013 {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        int n = nums.length;
        Arrays.sort(nums);
        int freq[] = new int[n+1];
        ArrayList<Integer> ans = new ArrayList();
        for(int i=0;i<n;i++) {
            int temp = nums[i];
            freq[temp]++;
        }
        int n1 = freq.length;
        for(int i=1;i<n1;i++) {
            if(freq[i]==0) {
                ans.add(i);
            }
        }

        System.out.println(ans);
        
    }
}
