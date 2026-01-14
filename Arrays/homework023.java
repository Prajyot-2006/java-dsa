/*Given an array arr consisting of only 0's and 1's in random order. 
Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array
 */

public class homework023 {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0};  // 01110
        int count0 = 0;
        int count1 = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                count0++;
            }
            else {
                count1++;
            }
        }
        System.out.println(count0);
        System.out.println(count1);

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int ele : arr) {
            System.out.print(ele+ " ");
        }
        
    }

}
