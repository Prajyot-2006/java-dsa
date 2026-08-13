// 2574. Left and Right Sum Differences
import java.util.ArrayList;

public class arraylistProblem {
    public static void main(String[] args) {
        int arr[] = {10,4,8,3};
        ArrayList<Integer> leftSum = new ArrayList<>();
        ArrayList<Integer> rightSum = new ArrayList<>();
        int n = arr.length;  // n=4
        for(int i=0;i<n;i++) {
            int j=i+1;
            int count = 0;
            while(j<n) {
                count = count + arr[j];
                j++;
            }
            rightSum.add(count);
        }
        for(int i=0;i<n;i++) {
            int j=i-1;
            int count = 0;
            while(j>=0) {
                count = count + arr[j];
                j--;
            }
            leftSum.add(count);
        }
        for (Integer ele : leftSum) {
            System.out.print(ele + " ");
        }
    }
}
