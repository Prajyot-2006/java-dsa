public class gcd {
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int high = arr[0];
        int low = arr[1];
        int mul = high*low;
        System.out.println(mul);

        int rem = -1;
        while(rem!=0) {
            rem = high%low;
            high = low;
            low = rem;
        }
        int gcd1 = high*high;
        System.out.println(mul/gcd1);
    }
}
