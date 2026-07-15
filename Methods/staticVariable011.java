public class staticVariable011 {
    
    static int visitors = 0;

    public static void main(String[] args) {
        visitors++;
        System.out.println(visitors);   // 1

        visitors++;
        System.out.println(visitors);   // 2

        visitors++;
        System.out.println(visitors);   // 3
    }
}
