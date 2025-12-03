
import java.util.Scanner;

public class dataTypeDoubt010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st integer :");
        int input1 = sc.nextInt();
        System.out.print("Enter 2nd integer :");
        int input2 = sc.nextInt();

        double sum = input1 + input2;  // why 10.0 bcoz the data type is double so its gonna store decimal values in it if the value is integer then it will get convereted into decimal with the help of .0 after integer
        System.out.println("The answer is in this data type :"+sum);

        // also dry run this code : 

        double div = 5/2;  
        System.out.println("Why the answer is 2.0 instead of 2.5 ? : "+div);
        System.out.println("because here the division is happening btwn 2 integers so thats why result will be in integer only remember : integere operation with integer = integer only  double operation with integer = double and double operation with double = double only");
        System.out.print("also the result is stored in double data type(double div) that means the integer result (which is 2 in this case) will be converted into double with the help of .0 after the value");

    }
}
