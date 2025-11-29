package Basics;

public class areaOfCircle04 {
    public static void main(String[] args) {
        double r = 5;
        double area = 3.14 * r * r;
        System.out.println(area);   // why the ans is not in integer value ? bcoz here decimal into integer gives decimal bcoz decimal has higher priority than integer and we are not doing int operation with int to get int value only  
    
    }
}
