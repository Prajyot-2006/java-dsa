/* same question in different way : Rotate the array : search on gfg platform for this entire question   */

public class homework020 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int n = arr.length;
        int r = 3;  // so output => 8,10,2,4,6
        // int r = 60; or 80 , 90
        r = r%n;   // incase if r=60 then ? 

        // reversing 2,4,6
        int i=0;
        int j=r-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // reversing 8,10
        int k=r;
        int s=n-1;
        while(k<s) {
            int temp = arr[k];
            arr[k] = arr[s];
            arr[s] = temp;
            k++;
            s--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // reversing final array to get the expected o/p
        int p=0;
        int q=n-1;
        while(p<q) {
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        
    }
}