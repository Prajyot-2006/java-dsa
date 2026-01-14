/*Given an array arr consisting of only 0's and 1's in random order. 
Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array */

public class homework024Suggregate0s1s {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,0,0,0};
        int count0 = 0;
        int count1 = 0;
        for (int ele : arr) {
            if(ele==0) {
                count0++;
            }
            else {
                count1++;
            }
        }
        System.out.println(count0);  
        System.out.println(count1); 
        int copy[] = new int[arr.length];
        for(int i=0;i<count0;i++) {
            copy[i] = 0;
        }
        for(int i=count0;i<arr.length;i++) {  
            copy[i] = 1;
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = copy[i];
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}