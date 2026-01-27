public class selectionSort07 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,3,8,9,6};
        int n = arr.length;  // 5
        
        for(int i=0;i<n-1;i++) { // i<4
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i;j<n;j++) {
                if(arr[j]<min) {
                    min = arr[j];  // u got 1 
                    mindex = j;  
                }
            }
            // swap the min with the 1st element of array 
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
