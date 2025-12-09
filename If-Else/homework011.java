/*
HW: Given a point (x, y), write a program
to find out if it lies in the 1st Quadrant,
2nd Quadrant, 3rd Quadrant, 4th
Quadrant, on the x-axis, y-axis or at the
origin.
 */
import java.util.Scanner;

public class homework011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.print("Enter y : ");
        int y = sc.nextInt();

        if(x>0 && y>0) {
            System.out.println("First Quadrant");
        }
        else if(x>0 && y<0) {
            System.out.println("Fourth Quadrant");
        }
        else if(x<0 && y<0) {
            System.out.println("Third Quadrant");
        }
        else if(x<0 && y>0) {
            System.out.println("Second Quadrant");
        }
        else if(x==0 && y==0) {
            System.out.println("Origin");
        }
        else if(y==0 && x!=0) {
            System.out.println("X-Axis");
        }
        else if(x==0 && y!=0) {
            System.out.println("Y-Axis");
        }
    }
}
