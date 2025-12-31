/*Ques: Print the second Maximum
element in the array */

public class homework015 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        int max = arr[0];
        int sMax = arr[0];
        // max element
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        // second max
        for(int j=0;j<arr.length;j++) {
            if(arr[j]>sMax && arr[j]!=max) {
                sMax = arr[j];
            }
        }

        System.out.println("The max : "+max);
       System.out.println("The second max : "+sMax);
    }
}
