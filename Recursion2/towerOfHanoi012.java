public class towerOfHanoi012 {
    public static void main(String[] args) {
        hanoi(2 , 'A','B','C');
    }
    public static void hanoi(int n , char src , char helper , char dest) {
        if(n==0) return;
        hanoi(n-1, src, dest, helper);
        System.out.println(src + " -> " + dest);
        hanoi(n-1, helper, src, dest);
    }
}