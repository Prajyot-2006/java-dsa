
public class homework05 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {0,1,3,5,6,9,11};
        int ans[] = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++) {
            ans[i] = arr1[i];
        }
        int indexJ = 0;
        for(int i=arr1.length;i<ans.length;i++) {
            ans[i] = arr2[indexJ];
            indexJ++;
        }
        // just printing 
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println("");
        // sorting 
        for(int i=0;i<ans.length;i++) {
            for(int j=1+i;j<ans.length;j++) {
                if(ans[i]>ans[j]) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        // just printing 
        for (int ele : ans) {
            System.out.print(ele + " ");
        }


    }
}