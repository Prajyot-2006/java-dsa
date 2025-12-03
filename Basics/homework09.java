// HW : calculate Simple interest

import java.util.Scanner;

public class homework09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle : ");
        double principle = sc.nextDouble();

        System.out.print("Enter rate : ");
        double rate = sc.nextInt();

        System.out.print("Enter time : ");
        double time = sc.nextInt();

        double simpleInterest = (principle * rate * time)/100;
        System.out.print("The Simple Interest is : "+simpleInterest);

        

        
    }
}
