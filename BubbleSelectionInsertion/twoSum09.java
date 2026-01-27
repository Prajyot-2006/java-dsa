/* Ques : 2-sum using another technique : just like reverse array process */


import java.util.Arrays;

public class twoSum09 {
    public static void main(String[] args) {
        int arr[] = {2,0,4,6,3};
        int n = arr.length;
        Arrays.sort(arr);  
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
        int target = 7;
        

        int i=0;
        int j=n-1;
        while(i<j) {
            if(arr[i]+arr[j]==target) {
                System.out.print("Target Found : "+i +" "+ j);
                break;
            }
            else if(arr[i]+arr[j]<target) {
                i++;
            }
            else if(arr[i]+arr[j]>target) {
                j--;
            }

        }





    }
}
