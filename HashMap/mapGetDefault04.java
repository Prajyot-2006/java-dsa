
import java.util.HashMap;

public class mapGetDefault04 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(1,100);
        map.put(2,200);
        System.out.println(map.getOrDefault(1,0));
        System.out.println(map.get(5));  // not exists so will give null
        System.out.println(map.getOrDefault(5,0));  // not exists so give default 0
    }
}
