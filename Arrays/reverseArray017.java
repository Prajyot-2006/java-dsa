public class reverseArray017 {

    public static void main(String[] args) {
        int arr[] = {2,1,3,7,5,1,8,4};
        int n = arr.length;
        int i = 0;
        int j = n-1;
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