// we learned about passByvalue 

public class passByvalue06 {

    public static void change(int x) {
        x = 10;  // this is different variable 
    }

    public static void main(String[] args) {
        int x = 6;  // and this is different variable
        System.out.println(x);  // 6
        change(x);
        System.out.println(x);  // 6
    }
}
