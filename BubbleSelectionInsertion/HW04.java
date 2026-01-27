// Ques : sort the array in descending order using bubble sort

public class HW04 {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int arr[] = {3,5,1,4,2,0};
        int n = arr.length;  // 6 
        for(int i=0;i<n-1;i++) {
            int swaps = 0;
            for(int j=0;j<n-1-i;j++) {  // we did j<n-1-i for not checking the sorted elements 
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);
    }
}
