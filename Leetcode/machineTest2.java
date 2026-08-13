import java.util.ArrayList;

public class machineTest2 {
    public static void main (String args[]) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        ArrayList<Integer> arr = new ArrayList<>();
  
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<k;j++) {
                if(nums[j]>max) {
                    max = nums[j];
                }

            }
            arr.add(max);
            k++;
            if(k==nums.length+1) break;
        }
        System.out.println(arr);
    }
}