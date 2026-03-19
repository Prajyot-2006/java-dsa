public class rev {
    public static void main(String[] args) {
        int arr[] = {2,4,3,1};
        int i=0;
        int j=arr.length-1;
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

    }
}
