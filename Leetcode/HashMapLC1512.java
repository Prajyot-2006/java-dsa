import java.util.HashMap;

public class HashMapLC1512 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+ 1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        int count = 0;
        for(int value : map.values()) {
            if(value>1) {
                count = count + value;
            }
        }
        System.out.println(count);
    }
}
