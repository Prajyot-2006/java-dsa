import java.util.Scanner;

public class factorial06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int n = sc.nextInt();
        int store = factorial(n);  
        System.out.println(store);
        
    }
    public static int factorial(int n) {
        if(n==0 || n==1) return 1;
        int ans = n * factorial(n-1);  
        return ans;
    }
    
}
