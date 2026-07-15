import java.util.Scanner;

public class optimizedHomework08 {
    static int a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int ans = power(b);  // 3
        System.out.println(ans);
    }
    public static int power(int b) {
        if(b==0) return 1;
        int call = power(b/2);
        int send;
        if(b%2==0) {
            send = call*call;
        }
        else {
            send = a*call*call;
        }
        return send;
    }
}
