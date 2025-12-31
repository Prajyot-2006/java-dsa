// This is deep copy - which means these 2 arrays are differnt but they contains same value
import java.util.Arrays;

public class deepCopy010 {
    public static void main(String[] args) {
        int arr[] = {20,40,60};
        int deep[] = Arrays.copyOf(arr, arr.length);  // means copying all elements of the arr array 
        deep[1] = 100;
        System.out.println(deep[1]);
        System.out.println(arr[1]);  // this wont change 
        // both arrays refernce value are different bcoz we created 2 diffeent arrays using Arrays.copyOf(arr, arr.length); 
        System.out.println("arr ka Reference value : "+arr); 
        System.out.println("deep ka reference value : "+deep);
    }
}