import java.util.ArrayList;

public class removeDuplicate026 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,4,4,4,4,5,6};
        int k=arr.length;
        ArrayList<Integer> arrList = new ArrayList<>(); 
        for(int i=0;i<arr.length;i++) {
            arrList.add(arr[i]);
        }
        for(int i=0;i<arrList.size()-1;i++) {
            if(arrList.get(i)==arrList.get(i+1)) {
                arrList.remove(i+1);
                i--;
                k--;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(i<arrList.size()) {
                arr[i] = arrList.get(i);
            }
            else {
                arr[i] = 0;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(k);
    }
}
