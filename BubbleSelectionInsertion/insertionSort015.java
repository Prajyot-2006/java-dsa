public class insertionSort015 {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,5,4,1,8,2,1};
        int n=arr.length;
        for(int i=1;i<n;i++) {  // 1 to 3
            int j=i;
            while(j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}