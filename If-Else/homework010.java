/*
HW: Take length and breadth of
rectangle as input and write a program
to find whether the area of rectangle is
greater than its perimeter.
*/

import java.util.Scanner;

public class homework010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();

        System.out.print("Enter breadth : ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);

        if(area>perimeter) {
            System.out.println("Area is greater than Perimeter");
        }
        else {
            System.out.println("Area is smaller than Perimeter");
        }

    }
}
