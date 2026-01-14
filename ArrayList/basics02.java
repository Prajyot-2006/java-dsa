// Learned : adding element in between index

import java.util.ArrayList;

public class basics02 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = arr.size(); // initially the size of ArrayList is 0 
        System.out.println(n);
        arr.add(10);  // added some elements in array
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);  // 10,20,30,40
        arr.add(1,15 ); // 10,15,20,30,40
        System.out.println(arr);
        arr.remove(arr.size()-1);  // removes 4th index element 
        System.out.println(arr.size());  // now check the size , it is updated 
    }
}
