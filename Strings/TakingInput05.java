
import java.util.Scanner;

public class TakingInput05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input : ");
        String s = sc.nextLine();  // take everything as input
        System.out.println(s);

        System.out.print("Enter input : ");
        String s1 = sc.next();  // takes only first word as input (takes all as input before space)
        System.out.println(s1);
        
    }
}
