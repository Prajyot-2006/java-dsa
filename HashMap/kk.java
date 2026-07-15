import java.util.ArrayList;
import java.util.HashMap;

public class kk {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        HashMap<Integer , Integer> map1 = new HashMap<>();
        HashMap<Integer , Integer> map2 = new HashMap<>();
        ArrayList<Integer> bore = new ArrayList();
        for(int i=0;i<nums1.length;i++) {
            int store = nums1[i];
            if(map1.containsKey(store)) {
                int get = map1.get(store);
                map1.put(store , get+1);
            }
            else {
                map1.put(store , 1);
            }
        }

        for(int i=0;i<nums2.length;i++) {
            int store = nums2[i];
            if(map2.containsKey(store)) {
                int get = map2.get(store);
                map2.put(store , get+1);
            }
            else {
                map2.put(store , 1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        for(int key : map1.keySet()) {
            int temp = map1.get(key);
            if(temp>1 && map2.containsKey(key)) {
                bore.add(key);
            }
        }
        for(int key : map2.keySet()) {
            int temp = map2.get(key);
            if(temp>1 && map1.containsKey(key)) {
                bore.add(key);
            }
        }
        System.out.println(bore);
    }
}