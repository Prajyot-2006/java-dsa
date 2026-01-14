public class leetocode {
    public static void main(String[] args) {
        int nums[] = {2,4,1,5,5};
        int target = 10;
        int store1 = 0;
        int store2 = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {  // nums.length = 5 
                if(nums[i] + nums[j] == target) {
                    store1 = i;
                    store2 = j;
                }
            }
        }

        int arr[] = {store1,store2};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
