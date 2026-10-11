import java.util.HashMap;

public class LeetcodeDistributecandies {
    public static void main(String[] args) {
	    int arr[] = {6,6,6,6};
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i] , map.get(arr[i])+1);
            }
            else {
                map.put(arr[i] , 1);
            }
        }
        System.out.println(map);
        for(int key : map.keySet()) {
            if(count>=(n/2)) break;
            count++;
        }
        
        System.out.println(count);
    }
}
