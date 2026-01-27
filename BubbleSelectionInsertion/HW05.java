// Ques: Move all Zeros to end , do this using bubble sort algorithm

public class HW05 {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int arr[] = {3,5,0,1,4,0,0,2,0};
        int n = arr.length;  
        for(int i=0;i<n-1;i++) {
            int swaps = 0;
            for(int j=0;j<n-1-i;j++) {  
                if(arr[j]==0) {
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
