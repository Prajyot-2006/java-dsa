/* Rotate the array   */

public class homework019 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int r = 2;
        int temp[] = new int[5];

        int i=0;  // 0,1
        int j=n-r-1;  // 2 , 3
        while(j<n) {
            temp[i] = arr[j];
            i++;
            j++;
        }

        int i1 = n-r;
        int j1 = 0;
        while(i1<n) {
            temp[i1] = arr[j1];
            i1++;
            j1++;
        }
// temp array : but in ques we are told that dont print another array just change the original array so thats why using this array to chnage the original  
        for (int ele : temp) {
            System.out.print(ele + " ");
        }
        // changing the original
        for(int p=0;p<n;p++) {
            arr[p] = temp[p];
        }

        System.out.print("Array after rotation : ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }


    }
}
