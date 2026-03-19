

public class rowWithMaxSumHW06 {

    public static int calcSum(int brr[]) {
        int sum = 0;
        for(int k=0;k<brr.length;k++) {
            sum = brr[k] + sum;
        }
        return sum;
    }


    public static void main(String[] args) {
        int arr[][] = {{2,4,1,6},{6,7,4,2},{8,9,5,3}};  // 13 19 25
        int rows = arr.length;
        //ArrayList<Integer> store = new ArrayList<>();
        int store1[] = new int[rows];
        int max = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < rows; i++) {
            int rowSum = calcSum(arr[i]);
            //store.add(calculate);
            store1[i] = rowSum;
        }
        for(int i=0;i<store1.length;i++) {
            if(store1[i]>max) {
                max = store1[i];
                maxRow = i;
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Max row number : "+maxRow);

    }
}