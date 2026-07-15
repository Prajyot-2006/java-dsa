import java.util.HashMap;

public class basics03 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            int num = arr[i];

            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        System.out.println(map);
    }
}
