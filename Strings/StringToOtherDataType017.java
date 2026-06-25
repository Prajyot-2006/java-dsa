// convert integer into string
import java.util.Scanner;

public class StringToOtherDataType017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int to string 
        // manual method
        int n = sc.nextInt();
        String s = n + "";
        System.out.println(s);

        // builtIn method 
        String s1 = Integer.toString(n);
        System.out.println(s1);

        // now String to integer
        String str = "234567";
        int n1 = Integer.parseInt(str);  // this convert it to integer
        System.out.println(n1+1);  // o/p should be 234568

        // String to character array
        String str1 = "ruhan";
        char arr[] = str1.toCharArray();
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}


