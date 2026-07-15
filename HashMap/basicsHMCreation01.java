import java.util.HashMap;

public class basicsHMCreation01 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(1,100);
        map.put(2,200);
        map.put(3,300);

        // direct print 
        System.out.println(map);
        
        // using keySet()
        for(int key : map.keySet()) { // map.keySet() gives all the keys present inside the HashMap.
            System.out.println(key + " -> " + map.get(key));
        }
        // u can check this map.keySet() provides all present key's 
        System.out.println(map.keySet());

    }
}