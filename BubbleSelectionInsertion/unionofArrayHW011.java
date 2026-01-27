/*Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays */

import java.util.ArrayList;

public class unionofArrayHW011 {
    public static void main(String[] args) {

        int a[] = {1,2,4};
        int b[] = {2,5,6,7};
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        ArrayList<Integer> res = new ArrayList<>();

        while (i < n && j < m) {

            // Skip duplicates in array a
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in array b
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                res.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                res.add(b[j]);
                j++;
            } else { // a[i] == b[j]
                res.add(a[i]);
                i++;
                j++;
            }
        }

        // Remaining elements of a[]
        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                res.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b[]
        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                res.add(b[j]);
            }
            j++;
        }

        System.out.println(res);
        

    }
}