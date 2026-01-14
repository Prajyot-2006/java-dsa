public class homework08 {
    public static void main(String[] args) {
        int arr[] = {2,1,2,2,2,1,0};  // 6-2 = 4 

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int ele : arr) {
            if(ele==0) count0++;
            if(ele==1) count1++;
            if(ele==2) count2++;
        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);

        int index = 0;

        for(int i=0;i<count0;i++) {
            arr[index] = 0;
            index++;
        }
        for(int i=0;i<count1;i++) {  // 2 - 4
            arr[index] = 1;
            index++;
        }
        for(int i=0;i<count2;i++) {
            arr[index] = 2;
            index++;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
