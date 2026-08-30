public class mingames2974 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6}; 
        int n = arr.length/2;
        int i = 0;
        int j = 0;
        while(i<n) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            j = j+2;
            i++;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        
    }
}