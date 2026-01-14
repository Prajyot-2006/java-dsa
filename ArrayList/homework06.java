// Ques : merge 2 sorted array in a single big array

import java.util.ArrayList;

public class homework06 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {0,1,1};
        ArrayList<Integer> arr = new ArrayList<>();

        int i=0;
        int j=0;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) {
                arr.add(a[i]);
                i++;
            }
            else {
                arr.add(b[j]);
                j++;
            }
        }

        // Remaining of a elements 
        while(i<a.length) {
            arr.add(a[i]);
            i++;
        }
        // Remaining of b elements 
        while(j<b.length) {
            arr.add(b[i]);
            j++;
        }
        System.out.println(arr);
        System.out.println(i);
    }
}
