// gfg Question : Given two integer arrays a[] and b[]. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class commonElementsHW010 {
    public static void main(String[] args) {
        int arr1[] = {3,4,2,2,4};
        int arr2[] = {3,2,2,7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> arr = new ArrayList<>();

        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]==arr2[j]) {
                arr.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]!=arr2[j]) {
                if(arr1[i]<arr2[j]) {
                    i++;
                }
                else {  // else arr[j] chota asel!
                    j++;
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr);

    }
}
