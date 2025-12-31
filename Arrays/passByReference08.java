// Pass By reference In Java

public class passByReference08 {

    public static void change (int arr[]){  // so this array also gets the same copy reference value of the passed array
        arr[2] = 100;  // thats why if we change here it aslo gets updated to the originl array 
    }


    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5};  // every array has a reference value so this array also has 
        System.out.println(arr);   // we know it prints its reference value (not the actual memory address)
        System.out.println(arr[2]);  // 3
        change(arr);  // sent reference value of this array
        System.out.println(arr[2]);
    }
}