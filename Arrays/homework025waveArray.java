public class homework025waveArray {

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 8, 9, 10,11};
        int n = arr.length;  
        
        int i=0;
        while(i<n){
            if(i==n-1) break; 
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i = i+2;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
