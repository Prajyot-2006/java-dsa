/*

Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class homework022 {


    public static void main(String[] args) {
        int nums[] = {12,4312,5643,763,1,2,3,5443};
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(9<nums[i] && nums[i]<100) {
                count++;
            }
            if(999<nums[i] && nums[i]<10000) {
                count++;
            }
            if(nums[i]==100000) {
                count++;
            }       
        }
        System.out.println(count);
    }
}
