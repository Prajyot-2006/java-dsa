
import java.util.HashMap;

public class basicOperations02 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // Insert Data
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        System.out.println(map);

        // Access value
        int store = map.get(2);
        System.out.println(store);

        // search key 
        boolean check = map.containsKey(3);
        System.out.println(check);

        // search value 
        boolean checkValue = map.containsValue(30);
        System.out.println(checkValue);

        // updating a value : map.put() is used for both inserting and updating value 
        map.put(3, 450);

        // delete key
        map.remove(2);
        System.out.println(map);



    }
}
