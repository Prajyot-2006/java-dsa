// question : 852. Peak Index in a Mountain Array

public class LC1 {
    public static void main(String[] args) {
        int arr[] = {0,2,-1,10};
        int max = Integer.MIN_VALUE;
        int peak = -1;
        int smax = Integer.MIN_VALUE;
        int peakS = -1;
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
                max = arr[i];
                peak = i;
            }
        }  // max = 10; peak=4

        for(int i=0;i<arr.length;i++) {
            if(smax<arr[i] && arr[i]!=max) {
                smax = arr[i];
                peakS = i;
            }

        }

        if(max==arr[arr.length-1]) {
            System.out.println(smax);
            System.out.println(peakS);
        }
        
        else if(arr[peak]>arr[peak+1]) {
            System.out.println(max);
            System.out.println(peak);
        }

    }
}
