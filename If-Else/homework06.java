/*
Ques: Take positive integer input and
print:
__Ichigo_____if number is divisible by 5
__Yhawach_______ if number is divisible by 3
___Rukia______ if number is divisible by 5 & 3 both
___Shinji______ if number is not divisible by 5 or 3
*/


import java.util.Scanner;

public class homework06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int integer = sc.nextInt();

        if(integer%5==0) {
            System.out.println("Ichigo");
        }
        else if(integer%3==0) {
            System.out.println("Yhawach");
        }
        else if(integer%5==0 && integer%3==0) {
            System.out.println("Rukia");
        }
        else if(integer%5!=0 || integer%3!=0) {
            System.out.println("Shinji");
        }

    }
}
