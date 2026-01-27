// learned about ArrayList : how to create arraylist , add elements , update elements , printing elements 

import java.util.ArrayList;



public class basics01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();  // created simple arraylist  // initially it is zero or it has zero elements 
        arr.add(10);  // added some elements in array
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr.get(1));  // printing index 1's value   like - arr[1] in normal array
        arr.set(2,35 );  // updated 2 index's value    like - arr[2] = 35 in normal array

        // printing array (1st method)  , not traversing the array
        System.out.println(arr);  // wont print the address , it will print the whole array instead

        // printing array (2nd method)
        int n = arr.size();  // arr.length
        for(int i=0;i<n;i++) {
            System.out.println(arr.get(i));
        }

        // also we can print by using foreach 
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
