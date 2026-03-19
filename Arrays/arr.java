import java.util.ArrayList;

public class arr {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); 
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.print(arr);
        arr.remove(1);
        System.out.print(arr);
    }
}
