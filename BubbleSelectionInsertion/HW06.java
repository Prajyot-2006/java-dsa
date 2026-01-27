// Ques: Move all Zeros to end , do this using ArrayList

import java.util.ArrayList;

public class HW06 {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int arr[] = {3,5,0,1,4,0,0,2,0};
        int n = arr.length; 
        ArrayList<Integer> arrList = new ArrayList<>();
        int temp[] = new int[n];

        for(int i=0;i<n;i++) {  // TC : O(n)
            if(arr[i]!=0) {
                arrList.add(arr[i]);
            }
        } 
        for(int i=0;i<n;i++) {  // TC : O(n)
            if(arr[i]==0) {
                arrList.add(arr[i]);
            }
        } 

        for(int i=0;i<n;i++) {  // TC : O(n)
            temp[i] = arrList.get(i);
        }
        print(temp);
        
    }
}
/* 
Total TC : O(n+n+n) = O(3n) = O(n)  
Space Complexity : O(n+1) = O(n)
*/