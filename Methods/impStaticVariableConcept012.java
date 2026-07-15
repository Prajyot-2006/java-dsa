public class impStaticVariableConcept012 {
    static int x = 0;
    public static void main(String[] args) {
        System.out.println(x);
        x++;
        System.out.println(x);

        int x = 100;
        System.out.println(x);  // this prints local variable 
        x++;
        System.out.println(x);
    }
}
