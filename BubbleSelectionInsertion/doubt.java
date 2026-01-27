import java.util.ArrayList;

public class doubt {
    public static void main(String[] args) {
        int a[] = {1,4,4,6,7};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            arr.add(a[i]);
        }
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        for(int i=0;i<=3;i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
