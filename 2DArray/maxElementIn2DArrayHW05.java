public class maxElementIn2DArrayHW05 {
    public static void main(String[] args) {
        int arr[][] = {{2,4,1,6},{6,7,4,2},{8,9,5,3}};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}