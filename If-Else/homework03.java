// HW : Take integer input and print the absolute value of that integer. absolute value means negative hoto positive banado and positivi hoto keep it as it is 

import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int integer = sc.nextInt();

        if(integer>0){
            System.out.println("The absolute value is : "+integer);
        }
        else{
            int absolute = integer * -1;
            System.out.println("The absoulute value is : "+absolute);
        }
    }
}
